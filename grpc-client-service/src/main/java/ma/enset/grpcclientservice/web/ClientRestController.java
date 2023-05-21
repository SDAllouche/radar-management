package ma.enset.grpcclientservice.web;

import ma.enset.grpcclientservice.stub.RadarGrpcServiceGrpc;
import ma.enset.grpcclientservice.stub.RadarService;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/rest-api")
public class ClientRestController {

    @GrpcClient("radar")
    private RadarGrpcServiceGrpc.RadarGrpcServiceBlockingStub blockingStub;



    @GetMapping("/violation")
    public RadarService.Violation violation(@RequestBody RadarService.SaveViolationRequest violation){

        System.out.println(violation.getRadarID());

        RadarService.SaveViolationResponse response=blockingStub.generateViolation(violation);

        System.out.println(response.getViolation().getRadarID());

        return response.getViolation();
    }

    @PostMapping("/violation")
    public RadarService.Violation generateViolation(@RequestBody Map<String,Object>  map){

        RadarService.SaveViolationRequest violation= RadarService.SaveViolationRequest.newBuilder()
                .setRadarID((int) map.get("radarID"))
                .setMaxSpeed((int) map.get("maxSpeed"))
                .setRegistrationNumber((int) map.get("registrationNumber"))
                .setCarSpeed((int) map.get("carSpeed"))
                .setDate((String) map.get("date"))
                .setPenalty((int) map.get("penalty"))
                .build();

        System.out.println(violation.getRadarID());

        RadarService.SaveViolationResponse response=blockingStub.generateViolation(violation);

        System.out.println(response.getViolation().getRadarID());

        return response.getViolation();
    }


}
