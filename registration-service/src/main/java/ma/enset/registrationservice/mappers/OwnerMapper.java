package ma.enset.registrationservice.mappers;


import ma.enset.registrationservice.dto.OwnerRequestDTO;
import ma.enset.registrationservice.dto.OwnerResponseDTO;
import ma.enset.registrationservice.entities.Owner;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class OwnerMapper {
    public OwnerResponseDTO fromOwner(Owner owner){
        OwnerResponseDTO ownerResponseDTO =new OwnerResponseDTO();
        BeanUtils.copyProperties(owner,ownerResponseDTO);
        return ownerResponseDTO;
    }

    public Owner fromOwnerRequestDTO(OwnerRequestDTO ownerRequestDTO){
        Owner owner =new Owner();
        BeanUtils.copyProperties(ownerRequestDTO,owner);
        return owner;
    }

}
