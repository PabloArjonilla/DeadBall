package es.pmac.deadball.domain.player;

import es.pmac.deadball.domain.player.Player;
import es.pmac.deadball.domain.team.Team;

import java.util.List;

public interface PlayerRepository {

    Player findById(String id);

    List<Player> findAll();

    List<Player> findAllByTeam(Team team);

    void save(Player player);

    void saveDelete(Player player);

    void deleteOne(String id);

    void delete(Player player);

    void deleteAll();

}
