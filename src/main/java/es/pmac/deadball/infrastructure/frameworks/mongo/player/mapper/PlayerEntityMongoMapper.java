package es.pmac.deadball.infrastructure.frameworks.mongo.player.mapper;

import es.pmac.deadball.domain.player.Player;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PlayerEntityMongoMapper {

    PlayerEntityMongoMapper INSTANCE = Mappers.getMapper(PlayerEntityMongoMapper.class);

    @Mappings({
            @Mapping(target = "uuid", source = "uuid.value"),
            @Mapping(target = "name", source = "name"),
    })
    PlayerEntityMongo modelToEntity(Player source);

    @Mappings({
            @Mapping(target = "uuid.value", source = "uuid"),
            @Mapping(target = "name", source = "name"),
    })
    Player entityToModel(PlayerEntityMongo source);
}
