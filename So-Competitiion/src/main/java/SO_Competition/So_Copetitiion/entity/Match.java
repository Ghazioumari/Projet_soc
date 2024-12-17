package SO_Competition.So_Copetitiion.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "matches")
@Data
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String competition;
    private String round;
    private String team1;
    private Integer team1goals;
    private String team2;
    private Integer team2goals;
    private Integer year;
}
