package es.pmac.deadball.infrastructure.drivers.api.player;

import es.pmac.deadball.domain.entity.player.Player;
import es.pmac.deadball.usecases.player.FindPlayerById;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GetOnePlayerByIdController {

    private final FindPlayerById findPlayerById;

    @GetMapping(value = "/players/{id}")
    public ResponseEntity<Player> findPlayerById(@PathVariable("id") String id) {
        return ResponseEntity.ok(findPlayerById.execute(id));
    }

}
