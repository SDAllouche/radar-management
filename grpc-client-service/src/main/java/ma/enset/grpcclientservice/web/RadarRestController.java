package ma.enset.grpcclientservice.web;

import ma.enset.grpcclientservice.stub.RadarGrpcServiceGrpc;
import ma.enset.grpcclientservice.stub.RadarService;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest-api")
public class RadarRestController {

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
    public RadarService.Violation generateViolation(@RequestBody RadarService.SaveViolationRequest violation){

        System.out.println(violation.getRadarID());

        RadarService.SaveViolationResponse response=blockingStub.generateViolation(violation);

        System.out.println(response.getViolation().getRadarID());

        return response.getViolation();
    }
}
