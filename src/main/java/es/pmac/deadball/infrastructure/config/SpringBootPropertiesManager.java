package es.pmac.deadball.infrastructure.config;

import es.pmac.deadball.domain.config.PropertiesManager;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SpringBootPropertiesManager implements PropertiesManager {

    //TODO ¿Qué es esto?

    private final Environment environment;

    @Override
    public String getProperties(String key) {
        return environment.getProperty(key);
    }
}
