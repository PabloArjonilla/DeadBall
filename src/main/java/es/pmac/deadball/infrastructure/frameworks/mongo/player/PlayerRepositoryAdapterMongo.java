package es.pmac.deadball.infrastructure.frameworks.mongo.player;

import es.pmac.deadball.domain.common.exceptions.NotFoundException;
import es.pmac.deadball.domain.entity.player.Player;
import es.pmac.deadball.domain.entity.player.PlayerRepository;
import es.pmac.deadball.infrastructure.frameworks.mongo.player.mapper.PlayerEntityMongo;
import es.pmac.deadball.infrastructure.frameworks.mongo.player.mapper.PlayerEntityMongoMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.jbosslog.JBossLog;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@JBossLog
@Repository
@RequiredArgsConstructor
public class PlayerRepositoryAdapterMongo implements PlayerRepository {

    private final MongoTemplate mongoTemplate;

    @Override
    public Player findById(String id) {

        return mongoTemplate.find(new Query().addCriteria(Criteria.where("id").is(id)), PlayerEntityMongo.class)
                .stream().map(PlayerEntityMongoMapper.INSTANCE::entityToModel).toList().stream().findAny().orElseThrow(NotFoundException::new);
    }

 /*   @Override
    public void save(Player player) {
        mongoTemplate.save(PlayerEntityMongoMapper.INSTANCE.modelToEntity(player));
    }
*/
}
