package com.football.consumer.service;

import com.football.consumer.client.DataCollectorClient;
import com.football.consumer.model.Competition;
import com.football.consumer.model.Match;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DataConsumerService {
    private final DataCollectorClient dataCollectorClient;

    public List<Competition> getAllCompetitions() {
        return dataCollectorClient.getAllCompetitions();
    }

    public List<Match> getAllMatches() {
        return dataCollectorClient.getAllMatches();
    }

    public List<Match> getMatchesByCompetition(String competition) {
        return dataCollectorClient.getMatchesByCompetition(competition);
    }

    public List<Match> getMatchesByYear(Integer year) {
        return dataCollectorClient.getMatchesByYear(year);
    }
}
