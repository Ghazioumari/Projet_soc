package SO_Competition.So_Copetitiion;

import SO_Competition.So_Copetitiion.entity.Match;
import SO_Competition.So_Copetitiion.repository.MatchRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SoCopetitiionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoCopetitiionApplication.class, args);
	}

	@Bean
    CommandLineRunner initDatabase(MatchRepository matchRepository) {
        return args -> {
            // Vérifier si le match existe déjà
            if (!matchRepository.existsById(1L)) {
                Match match = new Match();
                match.setId(1L);
                match.setCompetition("Ligue des Champions");
                match.setYear(2024);
                match.setTeam1("PSG");
                match.setTeam2("Real Madrid");
                match.setTeam1goals(2);
                match.setTeam2goals(1);
                match.setRound("Quart de finale");
                matchRepository.save(match);
                System.out.println("Match de test créé avec succès!");
            }
        };
    }
}
