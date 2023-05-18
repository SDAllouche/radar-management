package ma.enset.registrationservice;

import ma.enset.registrationservice.entities.Car;
import ma.enset.registrationservice.entities.Owner;
import ma.enset.registrationservice.repositories.CarRepository;
import ma.enset.registrationservice.repositories.OwnerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.*;

@SpringBootApplication
public class RegistrationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegistrationServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CarRepository carRepository, OwnerRepository ownerRepository){
        return args -> {
            for (int i=0;i<10 ; i++) {
                String name="Owner"+new Random().nextInt(100);
                Owner owner= Owner.builder()
                        .name(name)
                        .mail(name+"@gmail.com")
                        .date(new Date())
                        .build();

                Owner savedOwner=ownerRepository.save(owner);


                for (int j=0;j<new Random().nextInt(1,3) ; j++) {
                    Car car =Car.builder()
                            .registartionNumber(new Random().nextInt(10000,1000000))
                            .power(new Random().nextInt(200))
                            .model(new Random().nextInt(1980,2023))
                            .owner(savedOwner)
                            .build();

                    carRepository.save(car) ;
                }
            }
        };
    }

}
