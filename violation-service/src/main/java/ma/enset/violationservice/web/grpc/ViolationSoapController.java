package ma.enset.violationservice.web.grpc;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import lombok.AllArgsConstructor;
import ma.enset.violationservice.dto.ViolationRequestDTO;
import ma.enset.violationservice.dto.ViolationResponseDTO;
import ma.enset.violationservice.repositories.ViolationRepository;
import ma.enset.violationservice.service.ViolationServiceImpl;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@WebService(serviceName = "ViolationWS")
@AllArgsConstructor
public class ViolationSoapController {

    private ViolationServiceImpl violationService;
    private ViolationRepository violationRepository;

    @WebMethod
    public List<ViolationResponseDTO> violations(){
        return violationService.getAllViolations();
    }

    @WebMethod
    public ViolationResponseDTO violationById(@WebParam(name = "id") Long id){
        return violationService.getViolation(id);
    }

    @WebMethod
    public ViolationResponseDTO saveCar(@WebParam(name="car") ViolationRequestDTO violationRequestDTO){
        return violationService.addViolation(violationRequestDTO);
    }

    @WebMethod
    public ViolationResponseDTO update(@WebParam(name = "car") ViolationRequestDTO violationRequestDTO,@WebParam(name = "id") long id){
        return violationService.updateViolation(violationRequestDTO, id);
    }

    @WebMethod
    public void delete(@WebParam(name = "id") long id){
        violationService.deleteViolation(id);
    }

}
