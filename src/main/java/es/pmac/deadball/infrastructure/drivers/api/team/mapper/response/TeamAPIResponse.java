package es.pmac.deadball.infrastructure.drivers.api.team.mapper.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class TeamAPIResponse {


    // TODO como mapeo lista

    private String id;
    private String name;
    private List<String> roster;
}
