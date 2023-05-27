package ma.enset.registrationservice.web.rest;

import ma.enset.registrationservice.dto.CarRequestDTO;
import ma.enset.registrationservice.dto.CarResponseDTO;
import ma.enset.registrationservice.entities.Owner;
import ma.enset.registrationservice.repositories.CarRepository;
import ma.enset.registrationservice.repositories.OwnerRepository;
import ma.enset.registrationservice.service.RegistrationServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/rest-api")
public class RegistrationRestController {

    private CarRepository carRepository;

    private RegistrationServiceImpl registrationService;
    private OwnerRepository ownerRepository;


    public RegistrationRestController(CarRepository carRepository, RegistrationServiceImpl registrationService, OwnerRepository ownerRepository) {
        this.carRepository = carRepository;
        this.registrationService = registrationService;

        this.ownerRepository = ownerRepository;
    }

    @GetMapping("/cars")
    public List<CarResponseDTO> Cars(){
        return registrationService.getAllCars();
    }

    @GetMapping("/cars/{id}")
    public CarResponseDTO CarByRegistration(@PathVariable long id){
        return registrationService.getCar(id);
    }

    @PostMapping("/cars")
    public CarResponseDTO saveAccount(@RequestBody CarRequestDTO carRequestDTO){

        return registrationService.addCar(carRequestDTO);
    }

    @PutMapping("/cars/{id}")
    public CarResponseDTO update(@RequestBody CarRequestDTO carRequestDTO,@PathVariable long id){
        return registrationService.updateCar(carRequestDTO,id);
    }

    @DeleteMapping("/cars/{id}")
    public void delete(@PathVariable long id){
        registrationService.deletCar(id);
    }

    @GetMapping("/cars/registration/{number}")
    public CarResponseDTO CarByRegistration(@PathVariable int number){
        return registrationService.getCarByRegistartionNumber(number);
    }


    @GetMapping("/cars/owners")
    public List<Owner> Owners(){
        return ownerRepository.findAll();
    }

    @GetMapping("/cars/owners/{id}")
    public Owner OwnerById(@PathVariable long id){
        return ownerRepository.findById(id).orElseThrow(()-> new RuntimeException(String.format("Owner %s not found",id)));
    }


}
