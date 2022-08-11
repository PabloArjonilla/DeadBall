package es.pmac.deadball.infrastructure.frameworks.mongo.team.mapper;

import es.pmac.deadball.infrastructure.frameworks.mongo.player.mapper.PlayerEntityMongo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "team")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class TeamEntityMongo {

    //TODO ver como se trae el mongo el objeto. si solo almaceno el ID es correcto¿?

    private String uuid;
    private String name;
    private List<PlayerEntityMongo> roster;
}
