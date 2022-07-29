package es.pmac.deadball.infrastructure.frameworks.mongo.player.mapper;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "player")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class PlayerEntityMongo {

    @Id
    private String uuid;

    private String name;
}
