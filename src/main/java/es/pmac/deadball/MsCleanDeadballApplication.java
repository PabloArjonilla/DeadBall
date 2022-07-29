package es.pmac.deadball;

import org.springframework.boot.SpringApplication;

import java.util.Locale;

public class MsCleanDeadballApplication {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        SpringApplication.run(MsCleanDeadballApplication.class, args);
    }
}
