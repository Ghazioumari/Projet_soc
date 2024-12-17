package com.football.consumer.model;

import lombok.Data;

@Data
public class Competition {
    private Long id;
    private String name;
    private String country;
    private Integer year;
    private String winner;
    private String runnerup;
}
