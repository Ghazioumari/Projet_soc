package com.football.collector.service;

import com.football.collector.entity.Competition;
import com.football.collector.entity.Match;
import com.football.collector.repository.CompetitionRepository;
import com.football.collector.repository.MatchRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class DataCollectorService {
    private final CompetitionRepository competitionRepository;
    private final MatchRepository matchRepository;

    public Competition saveCompetition(Map<String, Object> competitionData) {
        Competition competition = new Competition();
        competition.setName((String) competitionData.get("name"));
        competition.setCountry((String) competitionData.get("country"));
        competition.setYear((Integer) competitionData.get("year"));
        competition.setWinner((String) competitionData.get("winner"));
        competition.setRunnerup((String) competitionData.get("runnerup"));
        
        return competitionRepository.save(competition);
    }

    public Match saveMatch(Map<String, Object> matchData) {
        Match match = new Match();
        match.setCompetition((String) matchData.get("competition"));
        match.setYear((Integer) matchData.get("year"));
        match.setRound((String) matchData.get("round"));
        match.setTeam1((String) matchData.get("team1"));
        match.setTeam2((String) matchData.get("team2"));
        match.setTeam1goals((Integer) matchData.get("team1goals"));
        match.setTeam2goals((Integer) matchData.get("team2goals"));
        
        return matchRepository.save(match);
    }

    public List<Competition> getAllCompetitions() {
        return competitionRepository.findAll();
    }

    public List<Match> getAllMatches() {
        return matchRepository.findAll();
    }

    public List<Match> getMatchesByCompetition(String competition) {
        return matchRepository.findByCompetition(competition);
    }

    public List<Match> getMatchesByYear(Integer year) {
        return matchRepository.findByYear(year);
    }
}
