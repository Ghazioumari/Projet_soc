package SO_Competition.So_Copetitiion.service;

import SO_Competition.So_Copetitiion.entity.Competition;
import SO_Competition.So_Copetitiion.repository.CompetitionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompetitionService {
    
    @Autowired
    private CompetitionRepository competitionRepository;
    
    public Competition getCompetition(Long id) {
        Optional<Competition> competition = competitionRepository.findById(id);
        return competition.orElse(null);
    }
    
    public Competition saveCompetition(Competition competition) {
        return competitionRepository.save(competition);
    }
}
