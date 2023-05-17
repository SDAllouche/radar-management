package ma.enset.registrationservice.web;

import ma.enset.registration.entities.Car;
import ma.enset.registration.entities.Owner;
import ma.enset.registration.repositories.CarRepository;
import ma.enset.registration.repositories.OwnerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/rest-api")
public class RegistrationRestController {

    private CarRepository carRepository;
    private OwnerRepository ownerRepository;


    public RegistrationRestController(CarRepository carRepository, OwnerRepository ownerRepository) {
        this.carRepository = carRepository;

        this.ownerRepository = ownerRepository;
    }

    @GetMapping("/cars")
    public List<Car> Cars(){
        return carRepository.findAll();
    }

    @GetMapping("/cars/{id}")
    public Car CarById(@PathVariable long id){
        return carRepository.findById(id).orElseThrow(()-> new RuntimeException(String.format("Account %s not found",id)));
    }

    @PostMapping("/cars")
    public Car saveCustomer(@RequestBody Car car){
        return carRepository.save(car);
    }

    @PutMapping("/cars/{id}")
    public Car update(@RequestBody Car car,@PathVariable long id){
        Car car1=carRepository.findById(id).orElseThrow();
        car1.setRegistartionNumber(car.getRegistartionNumber());
        car1.setPower(car.getPower());
        car1.setModel(car.getModel());
        car1.setOwner(car.getOwner());
        return carRepository.save(car1);
    }

    @DeleteMapping("/cars/{id}")
    public void delete(@PathVariable long id){
        carRepository.deleteById(id);
    }

    @GetMapping("/owners")
    public List<Owner> Owners(){
        return ownerRepository.findAll();
    }

    @GetMapping("/owners/{id}")
    public Owner OwnerById(@PathVariable long id){
        return ownerRepository.findById(id).orElseThrow(()-> new RuntimeException(String.format("Owner %s not found",id)));
    }

    @PostMapping("/owners")
    public Owner saveOwner(@RequestBody Owner owner){
        return ownerRepository.save(owner);
    }

    @PutMapping("/owners/{id}")
    public Owner updateOwner(@RequestBody Owner owner,@PathVariable long id){
        Owner owner1=ownerRepository.findById(id).orElseThrow();
        owner1.setName(owner.getName());
        owner1.setDate(new Date());
        owner1.setMail(owner.getMail());
        return ownerRepository.save(owner1);
    }

    @DeleteMapping("/owners/{id}")
    public void deleteOwner(@PathVariable long id){
        ownerRepository.deleteById(id);
    }

}
