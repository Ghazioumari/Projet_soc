package com.football.collector.controller;

import com.football.collector.entity.Competition;
import com.football.collector.entity.Match;
import com.football.collector.service.DataCollectorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/collector")
@RequiredArgsConstructor
public class DataCollectorController {
    private final DataCollectorService dataCollectorService;

    @PostMapping("/competitions")
    public ResponseEntity<Competition> addCompetition(@RequestBody Map<String, Object> competitionData) {
        return ResponseEntity.ok(dataCollectorService.saveCompetition(competitionData));
    }

    @PostMapping("/matches")
    public ResponseEntity<Match> addMatch(@RequestBody Map<String, Object> matchData) {
        return ResponseEntity.ok(dataCollectorService.saveMatch(matchData));
    }

    @GetMapping("/competitions")
    public ResponseEntity<List<Competition>> getAllCompetitions() {
        return ResponseEntity.ok(dataCollectorService.getAllCompetitions());
    }

    @GetMapping("/matches")
    public ResponseEntity<List<Match>> getAllMatches() {
        return ResponseEntity.ok(dataCollectorService.getAllMatches());
    }

    @GetMapping("/matches/competition/{competition}")
    public ResponseEntity<List<Match>> getMatchesByCompetition(@PathVariable String competition) {
        return ResponseEntity.ok(dataCollectorService.getMatchesByCompetition(competition));
    }

    @GetMapping("/matches/year/{year}")
    public ResponseEntity<List<Match>> getMatchesByYear(@PathVariable Integer year) {
        return ResponseEntity.ok(dataCollectorService.getMatchesByYear(year));
    }
}
