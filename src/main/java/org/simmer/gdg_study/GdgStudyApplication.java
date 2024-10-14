package org.simmer.gdg_study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class GdgStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(GdgStudyApplication.class, args);
    }

}
