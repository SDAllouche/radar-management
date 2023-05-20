package ma.enset.violationservice.service;


import ma.enset.violationservice.model.Car;
import ma.enset.violationservice.model.Radar;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "registration-service")
public interface RadarService {

    @GetMapping("/radars/{id}")
    Radar radarByID(@PathVariable long id);

    @GetMapping("/radars")
    List<Radar> getAllRadars();
}
