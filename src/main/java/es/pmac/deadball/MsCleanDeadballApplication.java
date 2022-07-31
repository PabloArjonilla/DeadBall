package es.pmac.deadball;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.Locale;

@EnableMongoRepositories
@SpringBootApplication
public class MsCleanDeadballApplication {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        SpringApplication.run(MsCleanDeadballApplication.class, args);
    }
}
