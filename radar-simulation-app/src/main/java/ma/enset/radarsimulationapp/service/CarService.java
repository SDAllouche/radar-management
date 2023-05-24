package ma.enset.radarsimulationapp.service;


import ma.enset.radarsimulationapp.model.Car;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "registration-service")
public interface CarService {

    @GetMapping("/rest-api/cars/{id}")
    Car carByID(@PathVariable long id);

    @GetMapping("/rest-api/cars/registration/{number}")
    Car carByRegistreNumber(@PathVariable int number);

    @GetMapping("/rest-api/cars")
    List<Car> getAllCars();
}
