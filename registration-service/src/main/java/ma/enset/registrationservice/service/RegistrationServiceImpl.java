package ma.enset.registrationservice.service;


import ma.enset.registrationservice.dto.CarRequestDTO;
import ma.enset.registrationservice.dto.CarResponseDTO;
import ma.enset.registrationservice.entities.Car;
import ma.enset.registrationservice.entities.Owner;
import ma.enset.registrationservice.mappers.CarMapper;
import ma.enset.registrationservice.mappers.OwnerMapper;
import ma.enset.registrationservice.repositories.CarRepository;
import ma.enset.registrationservice.repositories.OwnerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service @Transactional
public class RegistrationServiceImpl implements RegistrationService {

    private CarRepository carRepository;
    private OwnerRepository ownerRepository;
    private CarMapper carMapper;
    private OwnerMapper ownerMapper;

    public RegistrationServiceImpl(CarRepository carRepository, OwnerRepository ownerRepository, CarMapper carMapper, OwnerMapper ownerMapper) {
        this.carRepository = carRepository;
        this.ownerRepository = ownerRepository;
        this.carMapper = carMapper;
        this.ownerMapper = ownerMapper;
    }

    @Override
    public List<CarResponseDTO> getAllCars() {
        List<CarResponseDTO> carResponseDTOS=new ArrayList<>();
        List<Car> cars=carRepository.findAll();
        cars.forEach(c->{
            CarResponseDTO carResponseDTO=carMapper.fromCar(c);
            carResponseDTOS.add(carResponseDTO);
        });
        return carResponseDTOS;
    }

    @Override
    public CarResponseDTO getCar(long id) {
        Car car = carRepository.findById(id).orElseThrow(()-> new RuntimeException(String.format("Car %s not found",id)));
        CarResponseDTO carResponseDTO=carMapper.fromCar(car);
        return carResponseDTO;
    }

    @Override
    public CarResponseDTO addCar(CarRequestDTO carRequestDTO) {
        Owner owner=carRequestDTO.getOwner();
        if (owner.getDate() == null) {
            owner.setDate(new Date());
        }
        Owner savedOwner=ownerRepository.save(owner);
        Car car=Car.builder()
                .registartionNumber(carRequestDTO.getRegistartionNumber())
                .brand(carRequestDTO.getBrand())
                .power(carRequestDTO.getPower())
                .model(carRequestDTO.getModel())
                .owner(savedOwner)
                .build();

        Car saved = carRepository.save(car);

        CarResponseDTO carResponseDTO=carMapper.fromCar(saved);

        return carResponseDTO;
    }

    @Override
    public CarResponseDTO getCarByRegistartionNumber(int number){
        Car car = carRepository.getCarByRegistartionNumber(number);
        CarResponseDTO carResponseDTO=carMapper.fromCar(car);
        return carResponseDTO;
    }

    @Override
    public CarResponseDTO updateCar(CarRequestDTO carRequestDTO,long id) {

        Car car =carRepository.findById(id).orElseThrow();
        Owner owner=ownerRepository.findById(carRequestDTO.getOwner().getId()).orElseThrow();
        owner.setDate(carRequestDTO.getOwner().getDate());
        owner.setName(carRequestDTO.getOwner().getName());
        owner.setMail(carRequestDTO.getOwner().getMail());
        owner.setCars(car.getOwner().getCars());
        Owner savedOwner=ownerRepository.save(owner);
        car.setRegistartionNumber(carRequestDTO.getRegistartionNumber());
        car.setBrand(carRequestDTO.getBrand());
        car.setPower(carRequestDTO.getPower());
        car.setModel(carRequestDTO.getModel());
        car.setOwner(owner);
        Car savedCar=carRepository.save(car);
        CarResponseDTO carResponseDTO=carMapper.fromCar(savedCar);

        return carResponseDTO;
    }

    @Override
    public void deletCar(long id) {
        carRepository.deleteById(id);
    }
}
