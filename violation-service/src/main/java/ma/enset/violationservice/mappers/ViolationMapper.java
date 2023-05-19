package ma.enset.violationservice.mappers;


import ma.enset.violationservice.dto.ViolationResponseDTO;
import ma.enset.violationservice.entities.Violation;
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

    /*public RadarService.Radar fromRadarGrpc(Radar radar){
        return modelMapper.map(radar,RadarService.Radar.Builder.class).build();
    }*/
}
