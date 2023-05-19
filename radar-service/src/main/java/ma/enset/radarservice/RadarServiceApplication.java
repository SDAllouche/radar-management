package ma.enset.radarservice;

import ma.enset.radarservice.entities.Radar;
import ma.enset.radarservice.repositories.RadarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.*;

@SpringBootApplication
public class RadarServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RadarServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(RadarRepository radarRepository){
        return args -> {
            for (int i=0;i<10 ; i++) {

                Radar radar = Radar.builder()
                        .maxSpeed(new Random().nextInt(40,125))
                        .longitude(new Random().nextDouble(-150,150))
                        .latitude(new Random().nextDouble(-150,150))
                        .build();

                radarRepository.save(radar) ;
            }
        };
    }

}
