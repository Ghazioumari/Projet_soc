package SO_Competition.So_Copetitiion.repository;

import SO_Competition.So_Copetitiion.entity.Competition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompetitionRepository extends JpaRepository<Competition, Long> {
}
