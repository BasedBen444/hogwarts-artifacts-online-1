package edu.tcu.cs.hogwartsartifactonline1;

import edu.tcu.cs.hogwartsartifactonline1.artifact.utils.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HogwartsArtifactOnline1Application {

    public static void main(String[] args) {
        SpringApplication.run(HogwartsArtifactOnline1Application.class, args);
    }

    @Bean
    public IdWorker idWorker(){
        return new IdWorker(1, 1);
    }
}
