package ma.enset.registrationservice.service;


import ma.enset.registrationservice.dto.CarRequestDTO;
import ma.enset.registrationservice.dto.CarResponseDTO;
import ma.enset.registrationservice.entities.Car;

import java.util.List;

public interface RegistrationService {

    public List<CarResponseDTO> getAllCars();
    public CarResponseDTO getCar(long id);

    public CarResponseDTO addCar(CarRequestDTO carRequestDTO);


    CarResponseDTO getCarByRegistartionNumber(int number);
}
