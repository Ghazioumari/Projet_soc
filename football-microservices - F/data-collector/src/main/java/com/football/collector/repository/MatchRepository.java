package com.football.collector.repository;

import com.football.collector.entity.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatchRepository extends JpaRepository<Match, Long> {
    List<Match> findByCompetition(String competition);
    List<Match> findByYear(Integer year);
}
