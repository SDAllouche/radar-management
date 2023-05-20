package ma.enset.violationservice.service;


import ma.enset.violationservice.model.Car;
import ma.enset.violationservice.model.Radar;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "radar-service")
public interface RadarService {

    @GetMapping("/rest-api/radars/{id}")
    Radar radarByID(@PathVariable long id);

    @GetMapping("/rest-api/radars")
    List<Radar> getAllRadars();
}
