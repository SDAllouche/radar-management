package ma.enset.registrationservice.service;


import ma.enset.registrationservice.dto.CarRequestDTO;
import ma.enset.registrationservice.dto.CarResponseDTO;
import ma.enset.registrationservice.entities.Car;
import org.hibernate.sql.Update;

import java.util.List;

public interface RegistrationService {

    public List<CarResponseDTO> getAllCars();
    public CarResponseDTO getCar(long id);

    public CarResponseDTO addCar(CarRequestDTO carRequestDTO);


    public CarResponseDTO getCarByRegistartionNumber(int number);

    public CarResponseDTO updateCar(CarRequestDTO car,long id) ;

    public void deletCar(long id);
}
