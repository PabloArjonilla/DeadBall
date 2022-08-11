package es.pmac.deadball.domain.entity.player;

import java.util.List;

public interface PlayerRepository {

    Player findById(String id);
    
    List<Player> findByTeam(String id);

    /*
    List<Player> findByTeam(Team team);

    void save(Player player);

    void deleteOne(String id);

    void deleteOne(Player player);
    */

}
