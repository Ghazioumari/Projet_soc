# Football Data System

This is a microservices-based system that collects football competition and match data from public APIs and stores it in a MySQL database. The system provides REST API endpoints to access the stored data.

## Project Structure

```
football_data_system/
├── requirements.txt    # Python dependencies
├── .env               # Environment variables
├── data_collector/    # Data collection microservice
│   ├── main.py       # Main script for data collection
│   └── data_fetcher.py # API data fetching functionality
├── api_service/      # API service microservice
│   └── main.py      # FastAPI implementation
└── database/        # Database related code
    └── connection.py # Database connection and operations
```

## Setup Instructions

1. Create a MySQL database named `football_data`

2. Install the required dependencies:
```bash
pip install -r requirements.txt
```

3. Configure the database connection in `.env`:
```
DB_HOST=localhost
DB_USER=your_username
DB_PASSWORD=your_password
DB_NAME=football_data
```

4. Run the data collector to fetch and store data:
```bash
python data_collector/main.py
```

5. Start the API service:
```bash
python api_service/main.py
```

## API Endpoints

- `GET /competitions`: Get all football competitions
- `GET /matches`: Get all football matches
- `GET /competitions/{year}`: Get competition details for a specific year
- `GET /matches/{team}`: Get all matches for a specific team

## Technologies Used

- Python 3.8+
- FastAPI
- MySQL
- Requests library
- python-dotenv

## Features

- Collects football competition data from external APIs
- Stores data in a MySQL database
- Provides REST API endpoints to access the data
- Supports querying competitions by year
- Supports querying matches by team
