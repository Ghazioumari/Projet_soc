package com.football.consumer.controller;

import com.football.consumer.model.Competition;
import com.football.consumer.model.Match;
import com.football.consumer.service.DataConsumerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/consumer")
@RequiredArgsConstructor
public class DataConsumerController {
    private final DataConsumerService dataConsumerService;

    @GetMapping("/competitions")
    public ResponseEntity<List<Competition>> getAllCompetitions() {
        return ResponseEntity.ok(dataConsumerService.getAllCompetitions());
    }

    @GetMapping("/matches")
    public ResponseEntity<List<Match>> getAllMatches() {
        return ResponseEntity.ok(dataConsumerService.getAllMatches());
    }

    @GetMapping("/matches/competition/{competition}")
    public ResponseEntity<List<Match>> getMatchesByCompetition(@PathVariable String competition) {
        return ResponseEntity.ok(dataConsumerService.getMatchesByCompetition(competition));
    }

    @GetMapping("/matches/year/{year}")
    public ResponseEntity<List<Match>> getMatchesByYear(@PathVariable Integer year) {
        return ResponseEntity.ok(dataConsumerService.getMatchesByYear(year));
    }
}
