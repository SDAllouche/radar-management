package ma.enset.radarservice.service;

import ma.enset.radarservice.model.Car;
import ma.enset.radarservice.model.Violation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "violation-service")
public interface ViolationService {

    @GetMapping("/rest-api/violations/{id}")
    Car violationByID(@PathVariable long id);

    @GetMapping("/rest-api/violations")
    List<Car> getAllViolations();

    @PostMapping("/rest-api/violations")
    Violation generateViolation(@RequestBody Violation violation);
}
