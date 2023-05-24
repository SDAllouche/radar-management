package ma.enset.grpcclientservice.web;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import ma.enset.grpcclientservice.dto.ViolationResponseDTO;
import ma.enset.grpcclientservice.mapper.ViolationMapper;
import ma.enset.grpcclientservice.stub.RadarGrpcServiceGrpc;
import ma.enset.grpcclientservice.stub.RadarService;
import net.devh.boot.grpc.client.inject.GrpcClient;
import net.devh.boot.grpc.client.inject.GrpcClientBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;



@RestController
@RequestMapping("/rest-api")
public class ClientRestController {


    @Autowired
    private ViolationMapper mapper;

    @PostMapping("/violations")
    public ViolationResponseDTO generateViolation(@RequestBody Map<String,Object>  map){

        ManagedChannel managedChannel= ManagedChannelBuilder.forAddress("localhost",9998)
                .usePlaintext()
                .build();

        RadarService.SaveViolationRequest violation= mapper.fromMap(map);

        RadarGrpcServiceGrpc.RadarGrpcServiceBlockingStub blockingStub=RadarGrpcServiceGrpc.newBlockingStub(managedChannel);
        RadarService.SaveViolationResponse response=blockingStub.generateViolation(violation);

        ViolationResponseDTO violationResponseDTO=mapper.fromGrpc(response);

        return violationResponseDTO;
    }
}

