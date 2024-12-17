package SO_Competition.So_Copetitiion.endpoint;

import SO_Competition.So_Copetitiion.entity.Match;
import SO_Competition.So_Copetitiion.service.MatchService;
import com.so_competition.competitions.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class MatchEndpoint {

    private static final String NAMESPACE_URI = "http://so-competition.com/competitions";

    @Autowired
    private MatchService matchService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getMatchRequest")
    @ResponsePayload
    public GetMatchResponse getMatch(@RequestPayload GetMatchRequest request) {
        GetMatchResponse response = new GetMatchResponse();
        try {
            Match match = matchService.getMatch(request.getId());
            com.so_competition.competitions.Match matchType = new com.so_competition.competitions.Match();
            BeanUtils.copyProperties(match, matchType);
            response.setMatch(matchType);
            System.out.println("Match trouvé et converti: " + matchType.getId() + ", " + matchType.getTeam1() + " vs " + matchType.getTeam2());
        } catch (RuntimeException e) {
            System.out.println("Erreur lors de la recherche du match: " + e.getMessage());
            throw new RuntimeException("Match non trouvé avec l'ID: " + request.getId());
        }
        return response;
    }
}
