package es.pmac.deadball.infrastructure.drivers.api.team.mapper.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class TeamAPIRequest {

    private String id;
    private String name;
}
