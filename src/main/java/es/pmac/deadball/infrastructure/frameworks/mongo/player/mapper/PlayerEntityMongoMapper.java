package es.pmac.deadball.infrastructure.frameworks.mongo.player.mapper;

import es.pmac.deadball.domain.entity.player.Player;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PlayerEntityMongoMapper {

    PlayerEntityMongoMapper INSTANCE = Mappers.getMapper(PlayerEntityMongoMapper.class);

    @Mappings({
            @Mapping(target = "id", source = "id.value"),
            @Mapping(target = "name", source = "name"),
    })
    PlayerEntityMongo modelToEntity(Player source);

    @Mappings({
            @Mapping(target = "id.value", source = "id"),
            @Mapping(target = "name", source = "name"),
    })
    Player entityToModel(PlayerEntityMongo source);
}
