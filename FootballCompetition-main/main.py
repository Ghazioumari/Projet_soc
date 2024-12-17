from data_collector.data_fetcher import FootballDataFetcher
from database.connection import DatabaseConnection
import logging
import time

logging.basicConfig(level=logging.INFO)
logger = logging.getLogger(__name__)

def main():
    """Main function to collect and store football data"""
    try:
        # Initialize data fetcher and database connection
        fetcher = FootballDataFetcher()
        db = DatabaseConnection()

        # Create database tables
        db.create_tables()

        # Fetch all data
        logger.info("Starting data collection...")
        all_data = fetcher.fetch_all_data()

        # Store competitions data
        for competition in all_data["competitions"]:
            db.insert_competition(competition)
            logger.info(f"Stored competition: {competition.get('name')} - {competition.get('year')}")

        # Store matches data
        for match in all_data["matches"]:
            db.insert_match(match)
            logger.info(f"Stored match: {match.get('team1')} vs {match.get('team2')}")

        logger.info("Data collection and storage completed successfully")

    except Exception as e:
        logger.error(f"An error occurred: {e}")
    finally:
        db.close()

if __name__ == "__main__":
    main()
