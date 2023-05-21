package ma.enset.grpcclientservice.mapper;

import ma.enset.grpcclientservice.dto.ViolationResponseDTO;
import ma.enset.grpcclientservice.stub.RadarService;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class ViolationMapper {

    public RadarService.SaveViolationRequest fromMap(Map <String,Object> map){
        RadarService.SaveViolationRequest violation= RadarService.SaveViolationRequest.newBuilder()
                .setRadarID((int) map.get("radarID"))
                .setMaxSpeed((int) map.get("maxSpeed"))
                .setRegistrationNumber((int) map.get("registrationNumber"))
                .setCarSpeed((int) map.get("carSpeed"))
                .setDate((String) map.get("date"))
                .setPenalty((int) map.get("penalty"))
                .build();

        return violation;
    }

    public ViolationResponseDTO fromGrpc(RadarService.SaveViolationResponse response){

        RadarService.Violation violation=response.getViolation();

        System.out.println();

        ViolationResponseDTO violationResponseDTO= ViolationResponseDTO.builder()
                .radarID(violation.getRadarID())
                .maxSpeed(violation.getCarSpeed())
                .registrationNumber((int) violation.getRegistrationNumber())
                .carSpeed(violation.getCarSpeed())
                .date(violation.getDate())
                .penalty(violation.getPenalty())
                .build();

        return violationResponseDTO;
    }

}
