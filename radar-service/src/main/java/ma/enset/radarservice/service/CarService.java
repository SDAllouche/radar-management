package ma.enset.radarservice.service;

import ma.enset.radarservice.model.Car;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "registration-service")
public interface CarService {

    @GetMapping("/cars/{id}")
    Car carByID(@PathVariable long id);

    @GetMapping("/cars/{number}")
    Car carByRegistreNumber(@PathVariable int number);

    @GetMapping("/cars")
    List<Car> getAllCars();
}
