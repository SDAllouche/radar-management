package ma.enset.registrationservice.web.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import lombok.AllArgsConstructor;
import ma.enset.registrationservice.dto.CarRequestDTO;
import ma.enset.registrationservice.dto.CarResponseDTO;
import ma.enset.registrationservice.entities.Car;
import ma.enset.registrationservice.entities.Owner;
import ma.enset.registrationservice.repositories.CarRepository;
import ma.enset.registrationservice.repositories.OwnerRepository;
import ma.enset.registrationservice.service.RegistrationServiceImpl;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.bind.Name;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@WebService(serviceName = "RegistrationWS")
@AllArgsConstructor
public class RegistrationSoapController {

    private RegistrationServiceImpl registrationService;
    private OwnerRepository ownerRepository;

    @WebMethod(operationName = "getAllCars")
    public List<CarResponseDTO> Cars(){
        return registrationService.getAllCars();
    }

    @WebMethod(operationName = "getCar")
    public CarResponseDTO customerById(@WebParam(name = "id") Long id){
        return registrationService.getCar(id);
    }

    @WebMethod(operationName = "saveCar")
    public CarResponseDTO saveCar(@WebParam(name="car")CarRequestDTO carRequestDTO){
        return registrationService.addCar(carRequestDTO);
    }

    @WebMethod(operationName = "updateCar")
    public CarResponseDTO update(@WebParam(name = "car") CarRequestDTO carRequestDTO,@WebParam(name = "id") long id){
        return registrationService.updateCar(carRequestDTO, id);
    }

    @WebMethod(operationName = "deleteCar")
    public void delete(@WebParam(name = "id") long id){
        registrationService.deletCar(id);
    }

    @WebMethod(operationName = "getAllOwners")
    public List<Owner> Owners(){
        return ownerRepository.findAll();
    }

    @WebMethod(operationName = "getOwner")
    public Owner OwnerById(@WebParam(name = "id") Long id){
        return ownerRepository.findById(id).orElseThrow(()-> new RuntimeException(String.format("Owner %s not found",id)));
    }
}
