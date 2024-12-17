package SO_Competition.So_Copetitiion.repository;

import SO_Competition.So_Copetitiion.entity.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchRepository extends JpaRepository<Match, Long> {
}
