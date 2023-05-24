package ma.enset.violationservice.mappers;


import ma.enset.violationservice.dto.ViolationResponseDTO;
import ma.enset.violationservice.entities.Violation;
import ma.enset.violationservice.web.grpc.stub.ViolationService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class ViolationMapper {

    private ModelMapper modelMapper=new ModelMapper();

    public ViolationResponseDTO fromViolation(Violation violation){
        ViolationResponseDTO violationResponseDTO =new ViolationResponseDTO();
        BeanUtils.copyProperties(violation, violationResponseDTO);
        return violationResponseDTO;
    }

    public ViolationService.Violation fromViolationGrpc(Violation violation) {
        return modelMapper.map(violation,ViolationService.Violation.Builder.class).build();
    }
}
