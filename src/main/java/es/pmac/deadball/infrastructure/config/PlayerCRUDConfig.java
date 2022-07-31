package es.pmac.deadball.infrastructure.config;

import es.pmac.deadball.domain.entity.player.PlayerRepository;
import es.pmac.deadball.usecases.player.FindPlayerById;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class PlayerCRUDConfig {

    @Bean
    FindPlayerById getFindPlayerById(PlayerRepository preRegistroOfertaRepository) {
        return new FindPlayerById(preRegistroOfertaRepository);
    }
}