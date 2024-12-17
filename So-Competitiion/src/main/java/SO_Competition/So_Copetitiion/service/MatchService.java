package SO_Competition.So_Copetitiion.service;

import SO_Competition.So_Copetitiion.entity.Match;
import SO_Competition.So_Copetitiion.repository.MatchRepository;
import jakarta.jws.WebParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MatchService {
    
    @Autowired
    private MatchRepository matchRepository;


    public Match getMatch(Long id) {
        Optional<Match> match = matchRepository.findById(id);
        System.out.println("Recherche du match avec l'ID: " + id);
        match.ifPresent(m -> System.out.println("Match trouvé: " + m.toString()));
        return match.orElseThrow(() -> new RuntimeException("Match not found for id: " + id));
    }
    public Match saveMatch(Match match) {
        return matchRepository.save(match);
    }
}
