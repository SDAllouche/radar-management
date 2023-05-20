package ma.enset.registrationservice.mappers;


import ma.enset.registrationservice.dto.CarResponseDTO;
import ma.enset.registrationservice.dto.OwnerResponseDTO;
import ma.enset.registrationservice.entities.Car;
import ma.enset.registrationservice.web.grpc.stub.CarService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@Component
public class CarMapper {

    private ModelMapper modelMapper=new ModelMapper();

    private OwnerMapper ownerMapper;

    public CarMapper(OwnerMapper ownerMapper) {
        this.ownerMapper = ownerMapper;
    }

    public CarResponseDTO fromCar(Car car){
        CarResponseDTO carResponseDTO =new CarResponseDTO();
        BeanUtils.copyProperties(car,carResponseDTO);
        OwnerResponseDTO ownerResponseDTO=ownerMapper.fromOwner(car.getOwner());
        carResponseDTO.setOwnerResponseDTO(ownerResponseDTO);
        return carResponseDTO;
    }

    public CarService.Car fromCarGrpc(Car car){
        CarService.Car savedCard= CarService.Car.newBuilder()
                .setId(car.getId())
                .setRegistartionNumber(car.getRegistartionNumber())
                .setBrand(car.getBrand())
                .setModel(car.getModel())
                .setPower(car.getPower())
                .setOwner(CarService.Owner.newBuilder()
                        .setId(car.getOwner().getId())
                        .setName(car.getOwner().getName())
                        .setDate(car.getOwner().getDate().toString())
                        .setMail(car.getOwner().getMail())
                        .build())
                .build();
        return savedCard;
    }
}
