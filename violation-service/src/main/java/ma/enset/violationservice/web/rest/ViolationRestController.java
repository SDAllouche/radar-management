package ma.enset.violationservice.web.rest;


import ma.enset.violationservice.dto.ViolationRequestDTO;
import ma.enset.violationservice.dto.ViolationResponseDTO;
import ma.enset.violationservice.repositories.ViolationRepository;
import ma.enset.violationservice.service.ViolationServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/rest-api")
public class ViolationRestController {

    private ViolationRepository violationRepository;
    private ViolationServiceImpl violationService;


    public ViolationRestController(ViolationRepository violationRepository, ViolationServiceImpl violationService) {
        this.violationRepository = violationRepository;
        this.violationService = violationService;
    }

    @GetMapping("/violations")
    public List<ViolationResponseDTO> Violations(){
        return violationService.getAllViolations();
    }

    @GetMapping("/violations/{id}")
    public ViolationResponseDTO ViolationById(@PathVariable long id){
        return violationService.getViolation(id);
    }

    @PostMapping("/violations")
    public ViolationResponseDTO saveViolation(@RequestBody ViolationRequestDTO violationRequestDTO){

        return violationService.addViolation(violationRequestDTO);
    }


}
