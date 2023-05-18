package ma.enset.registrationservice.mappers;


import ma.enset.registrationservice.dto.CarResponseDTO;
import ma.enset.registrationservice.dto.OwnerResponseDTO;
import ma.enset.registrationservice.entities.Car;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class CarMapper {

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
}
