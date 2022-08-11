package es.pmac.deadball.usecases.player;

import es.pmac.deadball.domain.entity.player.Player;
import es.pmac.deadball.domain.entity.player.PlayerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.jbosslog.JBossLog;

import java.util.List;

@JBossLog
@RequiredArgsConstructor
public class FindPlayersByTeam {
    private final PlayerRepository playerRepository;

    public List<Player> execute(String id) {
        return playerRepository.findByTeam(id);
    }
}
