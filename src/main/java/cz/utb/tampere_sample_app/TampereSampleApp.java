package cz.utb.tampere_sample_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class TampereSampleApp {

    public static void main(String[] args) {
        SpringApplication.run(TampereSampleApp.class, args);
    }

}
