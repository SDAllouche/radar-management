package ma.enset.violationservice.web.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import lombok.AllArgsConstructor;
import ma.enset.violationservice.dto.ViolationResponseDTO;
import ma.enset.violationservice.service.ViolationServiceImpl;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@WebService(serviceName = "ViolationService")
@AllArgsConstructor
public class ViolationSoapController {

    private ViolationServiceImpl violationService;

    @WebMethod
    public List<ViolationResponseDTO> radars(){
        return violationService.getAllViolations();
    }

    @WebMethod
    public ViolationResponseDTO radarById(@WebParam(name = "id") Long id){
        return violationService.getViolation(id);
    }

}
