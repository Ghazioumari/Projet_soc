import requests
import logging
from typing import Dict, List, Any

class FootballDataFetcher:
    def __init__(self):
        self.competitions_base_url = "https://jsonmock.hackerrank.com/api/football_competitions"
        self.matches_base_url = "https://jsonmock.hackerrank.com/api/football_matches"
        
    def fetch_competitions(self, page: int = 1) -> Dict[str, Any]:
        """Fetch football competitions data"""
        try:
            response = requests.get(f"{self.competitions_base_url}?page={page}")
            response.raise_for_status()
            return response.json()
        except requests.RequestException as e:
            logging.error(f"Error fetching competitions data: {e}")
            return {"error": str(e)}

    def fetch_matches(self, page: int = 1) -> Dict[str, Any]:
        """Fetch football matches data"""
        try:
            response = requests.get(f"{self.matches_base_url}?page={page}")
            response.raise_for_status()
            return response.json()
        except requests.RequestException as e:
            logging.error(f"Error fetching matches data: {e}")
            return {"error": str(e)}

    def fetch_all_data(self) -> Dict[str, List[Dict]]:
        """Fetch all competitions and matches data"""
        all_data = {
            "competitions": [],
            "matches": []
        }
        
        # Fetch competitions
        page = 1
        
        while True:
            print(f"page:{page}")
            comp_data = self.fetch_competitions(page)
            if "data" not in comp_data:
                break
            all_data["competitions"].extend(comp_data["data"])
            if page >= comp_data.get("total_pages", 1):
                break
            page += 1
            if page == 100:
                break

        # Fetch matches
        page = 1
        while True:
            print(f"page:{page}")
            match_data = self.fetch_matches(page)
            if "data" not in match_data:
                break
            all_data["matches"].extend(match_data["data"])
            if page >= match_data.get("total_pages", 1):
                break
            page += 1
            if page == 100:
                break

        return all_data
