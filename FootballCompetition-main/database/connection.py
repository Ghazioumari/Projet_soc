import mysql.connector
from mysql.connector import Error
import os
from dotenv import load_dotenv

load_dotenv()

class DatabaseConnection:
    def __init__(self):
        self.connection = None
        self.connect()

    def connect(self):
        """Create database connection"""
        try:
            self.connection = mysql.connector.connect(
                host=os.getenv('DB_HOST', 'localhost'),
                user=os.getenv('DB_USER', 'root'),
                password=os.getenv('DB_PASSWORD', ''),
                database=os.getenv('DB_NAME', 'football_data')
            )
            if self.connection.is_connected():
                print("Successfully connected to the database")
        except Error as e:
            print(f"Error connecting to MySQL Database: {e}")

    def create_tables(self):
        """Create necessary tables if they don't exist"""
        try:
            cursor = self.connection.cursor()
            
            # Create competitions table
            cursor.execute("""
                CREATE TABLE IF NOT EXISTS competitions (
                    id INT AUTO_INCREMENT PRIMARY KEY,
                    name VARCHAR(255),
                    country VARCHAR(255),
                    year INT,
                    winner VARCHAR(255),
                    runnerup VARCHAR(255)
                )
            """)

            # Create matches table
            cursor.execute("""
                CREATE TABLE IF NOT EXISTS matches (
                    id INT AUTO_INCREMENT PRIMARY KEY,
                    competition VARCHAR(255),
                    year INT,
                    round VARCHAR(255),
                    team1 VARCHAR(255),
                    team2 VARCHAR(255),
                    team1goals INT,
                    team2goals INT
                )
            """)

            self.connection.commit()
            print("Tables created successfully")
            
        except Error as e:
            print(f"Error creating tables: {e}")
        finally:
            if cursor:
                cursor.close()

    def insert_competition(self, competition_data):
        """Insert competition data into database"""
        try:
            cursor = self.connection.cursor()
            sql = """INSERT INTO competitions (name, country, year, winner, runnerup)
                    VALUES (%s, %s, %s, %s, %s)"""
            cursor.execute(sql, (
                competition_data['name'],
                competition_data['country'],
                competition_data['year'],
                competition_data['winner'],
                competition_data['runnerup']
            ))
            self.connection.commit()
        except Error as e:
            print(f"Error inserting competition: {e}")
        finally:
            if cursor:
                cursor.close()

    def insert_match(self, match_data):
        """Insert match data into database"""
        try:
            cursor = self.connection.cursor()
            sql = """INSERT INTO matches (competition, year, round, team1, team2, team1goals, team2goals)
                    VALUES (%s, %s, %s, %s, %s, %s, %s)"""
            cursor.execute(sql, (
                match_data['competition'],
                match_data['year'],
                match_data['round'],
                match_data['team1'],
                match_data['team2'],
                int(match_data['team1goals']),
                int(match_data['team2goals'])
            ))
            self.connection.commit()
        except Error as e:
            print(f"Error inserting match: {e}")
        finally:
            if cursor:
                cursor.close()

    def close(self):
        """Close database connection"""
        if self.connection and self.connection.is_connected():
            self.connection.close()
            print("Database connection closed")
