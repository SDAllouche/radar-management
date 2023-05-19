package ma.enset.radarservice.web.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import lombok.AllArgsConstructor;
import ma.enset.radarservice.service.RadarServiceImpl;
import ma.enset.radarservice.dto.RadarResponseDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@WebService(serviceName = "RadarService")
@AllArgsConstructor
public class RadarSoapController {

    private RadarServiceImpl radarService;

    @WebMethod
    public List<RadarResponseDTO> radars(){
        return radarService.getAllRadars();
    }

    @WebMethod
    public RadarResponseDTO radarById(@WebParam(name = "id") Long id){
        return radarService.getRadar(id);
    }

}
