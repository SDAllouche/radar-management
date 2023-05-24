package ma.enset.violationservice.service;


import ma.enset.violationservice.dto.ViolationRequestDTO;
import ma.enset.violationservice.dto.ViolationResponseDTO;

import java.util.List;

public interface ViolationService {

    public List<ViolationResponseDTO> getAllViolations();
    public ViolationResponseDTO getViolation(long id);

    public ViolationResponseDTO addViolation(ViolationRequestDTO radarRequestDTO);

    public ViolationResponseDTO updateViolation(ViolationRequestDTO radarRequestDTO, long id);
    public void deleteViolation(long id);
}
