package ma.enset.radarservice.web.rest;

import ma.enset.radarservice.dto.RadarRequestDTO;
import ma.enset.radarservice.service.RadarServiceImpl;
import ma.enset.radarservice.dto.RadarResponseDTO;
import ma.enset.radarservice.repositories.RadarRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/rest-api")
public class RegistrationRestController {

    private RadarRepository radarRepository;

    private RadarServiceImpl radarService;


    public RegistrationRestController(RadarRepository radarRepository, RadarServiceImpl radarService) {
        this.radarRepository = radarRepository;
        this.radarService = radarService;
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


}
