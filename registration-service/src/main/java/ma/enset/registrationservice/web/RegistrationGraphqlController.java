package ma.enset.registrationservice.web;

import ma.enset.registrationservice.entities.Car;
import ma.enset.registrationservice.entities.Owner;
import ma.enset.registrationservice.repositories.CarRepository;
import ma.enset.registrationservice.repositories.OwnerRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class RegistrationGraphqlController {

    private CarRepository carRepository;
    private OwnerRepository ownerRepository;

    public RegistrationGraphqlController(CarRepository carRepository, OwnerRepository ownerRepository) {

        this.carRepository = carRepository;
        this.ownerRepository = ownerRepository;
    }


    @QueryMapping
    public List<Car> carsList(){
        return  carRepository.findAll();
    }

    @QueryMapping
    public Car carById(@Argument int id){
        return  carRepository.findById(Long.valueOf(id))
                .orElseThrow(()->new RuntimeException(String.format("car not found")));
    }

    @MutationMapping
    public Car addCar(@Argument Car car){
        return carRepository.save(car);
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



