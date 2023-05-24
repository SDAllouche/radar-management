package ma.enset.violationservice.service;


import ma.enset.violationservice.dto.ViolationRequestDTO;
import ma.enset.violationservice.dto.ViolationResponseDTO;
import ma.enset.violationservice.entities.Violation;
import ma.enset.violationservice.mappers.ViolationMapper;
import ma.enset.violationservice.repositories.ViolationRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service @Transactional
public class ViolationServiceImpl implements ViolationService {

    private ViolationRepository violationRepository;
    private ViolationMapper violationMapper;

    public ViolationServiceImpl(ViolationRepository violationRepository, ViolationMapper violationMapper) {
        this.violationRepository = violationRepository;
        this.violationMapper = violationMapper;
    }

    @Override
    public List<ViolationResponseDTO> getAllViolations() {
        List<ViolationResponseDTO> violationResponseDTOS =new ArrayList<>();
        List<Violation> violations = violationRepository.findAll();
        violations.forEach(c->{
            ViolationResponseDTO violationResponseDTO = violationMapper.fromViolation(c);
            violationResponseDTOS.add(violationResponseDTO);
        });
        return violationResponseDTOS;
    }

    @Override
    public ViolationResponseDTO getViolation(long id) {
        Violation radar = violationRepository.findById(id).orElseThrow(()-> new RuntimeException(String.format("Radar %s not found",id)));
        ViolationResponseDTO violationResponseDTO = violationMapper.fromViolation(radar);
        return violationResponseDTO;
    }

    @Override
    public ViolationResponseDTO addViolation(ViolationRequestDTO violationRequestDTO) {
        Violation violation = Violation.builder()
                .maxSpeed(violationRequestDTO.getMaxSpeed())
                .penalty(violationRequestDTO.getPenalty())
                .carSpeed(violationRequestDTO.getCarSpeed())
                .registrationNumber(violationRequestDTO.getRegistrationNumber())
                .date(new Date())
                .radarID(violationRequestDTO.getRadarID())
                .build();

        Violation saved = violationRepository.save(violation);

        ViolationResponseDTO violationResponseDTO = violationMapper.fromViolation(saved);

        return violationResponseDTO;
    }

    @Override
    public ViolationResponseDTO updateViolation(ViolationRequestDTO violationRequestDTO, long id) {
        Violation violation=violationRepository.findById(id).orElseThrow();
        violation.setMaxSpeed(violationRequestDTO.getMaxSpeed());
        violation.setRadarID(violationRequestDTO.getRadarID());
        violation.setRegistrationNumber(violationRequestDTO.getRegistrationNumber());
        violation.setCarSpeed(violationRequestDTO.getCarSpeed());
        violation.setDate(new Date());
        Violation savedViolation=violationRepository.save(violation);
        ViolationResponseDTO violationResponseDTO=violationMapper.fromViolation(savedViolation);

        return violationResponseDTO;
    }

    @Override
    public void deleteViolation(long id) {
        violationRepository.deleteById(id);
    }
}
