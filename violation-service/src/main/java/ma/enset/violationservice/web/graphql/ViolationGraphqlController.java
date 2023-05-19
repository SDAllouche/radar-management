package ma.enset.violationservice.web.graphql;



import ma.enset.violationservice.dto.ViolationRequestDTO;
import ma.enset.violationservice.dto.ViolationResponseDTO;
import ma.enset.violationservice.mappers.ViolationMapper;
import ma.enset.violationservice.repositories.ViolationRepository;
import ma.enset.violationservice.service.ViolationServiceImpl;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ViolationGraphqlController {

    private ViolationRepository violationRepository;
    private ViolationServiceImpl violationService;

    public ViolationGraphqlController(ViolationRepository violationRepository, ViolationServiceImpl violationService) {

        this.violationRepository = violationRepository;
        this.violationService = violationService;
    }


    @QueryMapping
    public List<ViolationResponseDTO> violationsList(){
        return  violationService.getAllViolations();
    }

    @QueryMapping
    public ViolationResponseDTO violationById(@Argument int id){
        return  violationService.getViolation(id);
    }

    @MutationMapping
    public ViolationResponseDTO addViolation(@Argument ViolationRequestDTO violationRequestDTO){
        return violationService.addViolation(violationRequestDTO);
    }

}



