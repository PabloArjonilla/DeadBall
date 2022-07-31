package es.pmac.deadball.domain.entity.player;

public interface PlayerRepository {

    Player findById(String id);

    //TODO Add usecase List<Player> findAll();

    //TODO Add usecase List<Player> findAllByTeam(Team team);

    //TODO Add usecase void save(Player player);

    //TODO Add usecase void saveDelete(Player player);

    //TODO Add usecase void deleteOne(String id);

    //TODO Add usecase void delete(Player player);

    //TODO Add usecase void deleteAll();

}
