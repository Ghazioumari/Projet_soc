package com.football.consumer.model;

import lombok.Data;

@Data
public class Match {
    private Long id;
    private String competition;
    private Integer year;
    private String round;
    private String team1;
    private String team2;
    private Integer team1goals;
    private Integer team2goals;
}
