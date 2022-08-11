package es.pmac.deadball.infrastructure.drivers.api.team.mapper.request;

import es.pmac.deadball.domain.entity.team.Team;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

public interface TeamAPIRequestMapper {
    TeamAPIRequestMapper INSTANCE = Mappers.getMapper(TeamAPIRequestMapper.class);
    
    @Mappings({
            @Mapping(target = "id", source = "id"),
            @Mapping(target = "name", source = "name"),
    })
    Team requestToModel(TeamAPIRequest source);

}
