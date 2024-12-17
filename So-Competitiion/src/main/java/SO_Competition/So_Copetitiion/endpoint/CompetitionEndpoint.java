package SO_Competition.So_Copetitiion.endpoint;

import SO_Competition.So_Copetitiion.entity.Competition;
import SO_Competition.So_Copetitiion.service.CompetitionService;
import com.so_competition.competitions.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CompetitionEndpoint {

    private static final String NAMESPACE_URI = "http://so-competition.com/competitions";

    @Autowired
    private CompetitionService competitionService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCompetitionRequest")
    @ResponsePayload
    public GetCompetitionResponse getCompetition(@RequestPayload GetCompetitionRequest request) {
        GetCompetitionResponse response = new GetCompetitionResponse();
        Competition competition = competitionService.getCompetition(request.getId());
        
        if (competition != null) {
            com.so_competition.competitions.Competition competitionType = new com.so_competition.competitions.Competition();
            BeanUtils.copyProperties(competition, competitionType);
            response.setCompetition(competitionType);
        }
        
        return response;
    }
}
