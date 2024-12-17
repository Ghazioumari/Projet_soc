package com.football.consumer.client;

import com.football.consumer.model.Competition;
import com.football.consumer.model.Match;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "data-collector")
public interface DataCollectorClient {
    @GetMapping("/api/collector/competitions")
    List<Competition> getAllCompetitions();

    @GetMapping("/api/collector/matches")
    List<Match> getAllMatches();

    @GetMapping("/api/collector/matches/competition/{competition}")
    List<Match> getMatchesByCompetition(@PathVariable String competition);

    @GetMapping("/api/collector/matches/year/{year}")
    List<Match> getMatchesByYear(@PathVariable Integer year);
}
