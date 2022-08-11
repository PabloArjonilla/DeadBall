package es.pmac.deadball.infrastructure.drivers.api.player;

import es.pmac.deadball.domain.entity.player.Player;
import es.pmac.deadball.usecases.player.FindPlayersByTeam;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class GetAllPlayersByTeamController {

    private final FindPlayersByTeam findPlayersByTeam;

    @GetMapping(value = "/team/{id}/players")
    public ResponseEntity<List<Player>> findPlayersByTeam(@PathVariable("id") String id) {
        return ResponseEntity.ok(findPlayersByTeam.execute(id));
    }
}
