package ma.enset.registrationservice.web.graphql;


import ma.enset.registrationservice.dto.CarRequestDTO;
import ma.enset.registrationservice.dto.CarResponseDTO;
import ma.enset.registrationservice.entities.Car;
import ma.enset.registrationservice.entities.Owner;
import ma.enset.registrationservice.repositories.CarRepository;
import ma.enset.registrationservice.repositories.OwnerRepository;
import ma.enset.registrationservice.service.RegistrationServiceImpl;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class RegistrationGraphqlController {

    private CarRepository carRepository;
    private OwnerRepository ownerRepository;

    private RegistrationServiceImpl registrationService;

    public RegistrationGraphqlController(CarRepository carRepository, OwnerRepository ownerRepository, RegistrationServiceImpl registrationService) {

        this.carRepository = carRepository;
        this.ownerRepository = ownerRepository;
        this.registrationService = registrationService;
    }


    @QueryMapping
    public List<CarResponseDTO> carsList(){
        return  registrationService.getAllCars();
    }

    @QueryMapping
    public CarResponseDTO carById(@Argument int id){
        return  registrationService.getCar(id);
    }

    @MutationMapping
    public CarResponseDTO addCar(@Argument CarRequestDTO carRequestDTO){
        return registrationService.addCar(carRequestDTO);
    }

    @QueryMapping
    public List<Owner> ownersList(){
        return  ownerRepository.findAll();
    }

    @QueryMapping
    public Owner ownerById(@Argument int id){
        return  ownerRepository.findById(Long.valueOf(id))
                .orElseThrow(()->new RuntimeException(String.format("owner not found")));
    }

    @MutationMapping
    public Owner addOwner(@Argument Owner owner){
        return ownerRepository.save(owner);
    }
}



