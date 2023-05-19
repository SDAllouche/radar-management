package ma.enset.radarservice.mappers;


import ma.enset.radarservice.dto.RadarResponseDTO;
import ma.enset.radarservice.entities.Radar;
import ma.enset.radarservice.web.grpc.stub.RadarService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class RadarMapper {

    private ModelMapper modelMapper=new ModelMapper();

    public RadarResponseDTO fromRadar(Radar radar){
        RadarResponseDTO radarResponseDTO =new RadarResponseDTO();
        BeanUtils.copyProperties(radar, radarResponseDTO);
        return radarResponseDTO;
    }

    public RadarService.Radar fromRadarGrpc(Radar radar){
        return modelMapper.map(radar,RadarService.Radar.Builder.class).build();
    }
}
