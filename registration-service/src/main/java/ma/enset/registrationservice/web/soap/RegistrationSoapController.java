package ma.enset.registrationservice.web.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import lombok.AllArgsConstructor;
import ma.enset.registrationservice.dto.CarResponseDTO;
import ma.enset.registrationservice.entities.Car;
import ma.enset.registrationservice.entities.Owner;
import ma.enset.registrationservice.repositories.CarRepository;
import ma.enset.registrationservice.repositories.OwnerRepository;
import ma.enset.registrationservice.service.RegistrationServiceImpl;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@WebService(serviceName = "CarService")
@AllArgsConstructor
public class RegistrationSoapController {

    private RegistrationServiceImpl registrationService;
    private OwnerRepository ownerRepository;

    @WebMethod
    public List<CarResponseDTO> Cars(){
        return registrationService.getAllCars();
    }

    @WebMethod
    public CarResponseDTO customerById(@WebParam(name = "id") Long id){
        return registrationService.getCar(id);
    }

    public List<Owner> Owners(){
        return ownerRepository.findAll();
    }

    public Owner OwnerById(@WebParam(name = "id") Long id){
        return ownerRepository.findById(id).orElseThrow(()-> new RuntimeException(String.format("Owner %s not found",id)));
    }
}
