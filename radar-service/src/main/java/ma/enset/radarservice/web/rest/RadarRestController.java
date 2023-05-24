package ma.enset.radarservice.web.rest;

import ma.enset.radarservice.dto.RadarRequestDTO;
import ma.enset.radarservice.entities.Radar;
import ma.enset.radarservice.model.Car;
import ma.enset.radarservice.model.Violation;
import ma.enset.radarservice.service.CarService;
import ma.enset.radarservice.service.RadarServiceImpl;
import ma.enset.radarservice.dto.RadarResponseDTO;
import ma.enset.radarservice.repositories.RadarRepository;
import ma.enset.radarservice.service.ViolationService;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Random;


@RestController
@RequestMapping("/rest-api")
public class RadarRestController {

    private RadarRepository radarRepository;

    private RadarServiceImpl radarService;

    private CarService carService;
    private ViolationService violationService;


    public RadarRestController(RadarRepository radarRepository, RadarServiceImpl radarService, CarService carService, ViolationService violationService) {
        this.radarRepository = radarRepository;
        this.radarService = radarService;
        this.carService = carService;
        this.violationService = violationService;
    }

    @GetMapping("/radars")
    public List<RadarResponseDTO> Radars(){
        return radarService.getAllRadars();
    }

    @GetMapping("/radars/{id}")
    public RadarResponseDTO RadarById(@PathVariable long id){
        return radarService.getRadar(id);
    }

    @PostMapping("/radars")
    public RadarResponseDTO saveRadar(@RequestBody RadarRequestDTO radarRequestDTO){

        return radarService.addRadar(radarRequestDTO);
    }

    @PutMapping("/radars/{id}")
    public RadarResponseDTO update(@RequestBody RadarRequestDTO radarRequestDTO,@PathVariable long id){
        return radarService.updateRadar(radarRequestDTO,id);
    }

    @DeleteMapping("/radars/{id}")
    public void delete(@PathVariable long id){
        radarService.delete(id);
    }


}
