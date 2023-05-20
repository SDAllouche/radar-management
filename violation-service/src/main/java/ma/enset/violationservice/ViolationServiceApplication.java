package ma.enset.violationservice;

import ma.enset.violationservice.entities.Violation;
import ma.enset.violationservice.repositories.ViolationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.Random;

@SpringBootApplication
public class ViolationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ViolationServiceApplication.class, args);
    }

    /*@Bean
    CommandLineRunner start(ViolationRepository violationRepository){
        return args -> {
            //int[] speeds={40,50,60,70,80,90,100,110,120};
            for (int i=0;i<5 ; i++) {

                Violation violation = Violation.builder()
                        .maxSpeed()
                        .penalty(new Random().nextDouble(100,800))
                        .carSpeed()
                        .registrationNumber()
                        .date(new Date())
                        .radarID()
                        .build();

                violationRepository.save(violation) ;
            }
        };
    }*/

}
