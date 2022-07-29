package es.pmac.deadball.infrastructure.frameworks.mongo.player;

import es.pmac.deadball.domain.common.exceptions.NotFoundException;
import es.pmac.deadball.domain.player.Player;
import es.pmac.deadball.domain.player.PlayerRepository;
import es.pmac.deadball.infrastructure.frameworks.mongo.player.mapper.PlayerEntityMongo;
import es.pmac.deadball.infrastructure.frameworks.mongo.player.mapper.PlayerEntityMongoMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.jbosslog.JBossLog;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@JBossLog
@Repository
@RequiredArgsConstructor
public class PlayerRepositoryAdapterMongo implements PlayerRepository {

    private final MongoTemplate mongoTemplate;

    @Override
    public Player findById(String id) {
        return Optional.ofNullable(mongoTemplate.findById(id, PlayerEntityMongo.class))
                .map(PlayerEntityMongoMapper.INSTANCE::entityToModel)
                .orElseThrow(NotFoundException::new);
    }

}
