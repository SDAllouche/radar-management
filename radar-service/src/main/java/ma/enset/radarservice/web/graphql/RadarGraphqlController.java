package ma.enset.radarservice.web.graphql;


import ma.enset.radarservice.dto.RadarRequestDTO;
import ma.enset.radarservice.dto.RadarResponseDTO;
import ma.enset.radarservice.repositories.RadarRepository;
import ma.enset.radarservice.service.RadarServiceImpl;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class RadarGraphqlController {

    private RadarRepository radarRepository;

    private RadarServiceImpl radarService;

    public RadarGraphqlController(RadarRepository radarRepository, RadarServiceImpl radarService) {

        this.radarRepository = radarRepository;
        this.radarService = radarService;
    }


    @QueryMapping
    public List<RadarResponseDTO> radarsList(){
        return  radarService.getAllRadars();
    }

    @QueryMapping
    public RadarResponseDTO radarById(@Argument int id){
        return  radarService.getRadar(id);
    }

    @MutationMapping
    public RadarResponseDTO addRadar(@Argument RadarRequestDTO radarRequestDTO){
        return radarService.addRadar(radarRequestDTO);
    }

}



