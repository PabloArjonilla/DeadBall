package es.pmac.deadball.infrastructure.drivers.api.player.mapper.request;

import es.pmac.deadball.domain.entity.player.Player;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PlayerAPIRequestMapper {

    PlayerAPIRequestMapper INSTANCE = Mappers.getMapper(PlayerAPIRequestMapper.class);

    @Mappings({
            @Mapping(target = "uuid.value", source = "uuid"),
            @Mapping(target = "name", source = "name"),
    })
    Player requestToModel(PlayerAPIRequest source);

}
