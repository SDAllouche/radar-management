package ma.enset.violationservice;

import ma.enset.violationservice.entities.Violation;
import ma.enset.violationservice.model.Car;
import ma.enset.violationservice.model.Radar;
import ma.enset.violationservice.repositories.ViolationRepository;
import ma.enset.violationservice.service.CarService;
import ma.enset.violationservice.service.RadarService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;
import java.util.Random;

@SpringBootApplication
@EnableFeignClients
public class ViolationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ViolationServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ViolationRepository violationRepository, CarService carService, RadarService radarService){
        return args -> {
            //int[] speeds={40,50,60,70,80,90,100,110,120};
            for (int i=0;i<5 ; i++) {

                List<Car> cars=carService.getAllCars();
                Car car =cars.get(new Random().nextInt(cars.size()));
                List<Radar> radars=radarService.getAllRadars();
                Radar radar=radars.get(new Random().nextInt(radars.size()));

                Violation violation = Violation.builder()
                        .maxSpeed(radar.getMaxSpeed())
                        .penalty(new Random().nextDouble(100,800))
                        .carSpeed(car.getPower())
                        .registrationNumber(car.getRegistartionNumber())
                        .date(new Date())
                        .radarID(radar.getId())
                        .build();

                violationRepository.save(violation) ;
            }
        };
    }

}
