package SO_Competition.So_Copetitiion.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "competitions")
@Data
public class Competition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String country;
    private Integer year;
    private String winner;
    private String runnerup;
}
