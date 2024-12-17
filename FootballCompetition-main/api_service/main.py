from fastapi import FastAPI, HTTPException
from database.connection import DatabaseConnection
from typing import List, Dict, Any
import uvicorn

app = FastAPI(title="Football Data API")

@app.get("/competitions")
async def get_competitions() -> List[Dict[str, Any]]:
    """Get all football competitions"""
    db = DatabaseConnection()
    try:
        cursor = db.connection.cursor(dictionary=True)
        cursor.execute("SELECT * FROM competitions")
        competitions = cursor.fetchall()
        return competitions
    finally:
        cursor.close()
        db.close()

@app.get("/matches")
async def get_matches() -> List[Dict[str, Any]]:
    """Get all football matches"""
    db = DatabaseConnection()
    try:
        cursor = db.connection.cursor(dictionary=True)
        cursor.execute("SELECT * FROM matches")
        matches = cursor.fetchall()
        return matches
    finally:
        cursor.close()
        db.close()

@app.get("/competitions/{year}")
async def get_competition_by_year(year: int) -> Dict[str, Any]:
    """Get competition details for a specific year"""
    db = DatabaseConnection()
    try:
        cursor = db.connection.cursor(dictionary=True)
        cursor.execute("SELECT * FROM competitions WHERE year = %s", (year,))
        competition = cursor.fetchone()
        if not competition:
            raise HTTPException(status_code=404, detail="Competition not found")
        return competition
    finally:
        cursor.close()
        db.close()

@app.get("/matches/{team}")
async def get_matches_by_team(team: str) -> List[Dict[str, Any]]:
    """Get all matches for a specific team"""
    db = DatabaseConnection()
    try:
        cursor = db.connection.cursor(dictionary=True)
        cursor.execute("""
            SELECT * FROM matches 
            WHERE team1 = %s OR team2 = %s
        """, (team, team))
        matches = cursor.fetchall()
        if not matches:
            raise HTTPException(status_code=404, detail="No matches found for this team")
        return matches
    finally:
        cursor.close()
        db.close()

if __name__ == "__main__":
    uvicorn.run("main:app", host="0.0.0.0", port=8000, reload=True)
