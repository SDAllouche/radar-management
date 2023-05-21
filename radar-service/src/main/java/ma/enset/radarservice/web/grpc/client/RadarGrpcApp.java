package ma.enset.radarservice.web.grpc.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import ma.enset.radarservice.web.grpc.stub.RadarGrpcServiceGrpc;
import ma.enset.radarservice.web.grpc.stub.RadarService;
import org.modelmapper.ModelMapper;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Random;


public class RadarGrpcApp {



    public static void main(Strisng[] args) throws IOException {

        ManagedChannel managedChannel= ManagedChannelBuilder.forAddress("localhost",9998)
                .usePlaintext()
                .build();

        RadarService.SaveViolationRequest.Builder builder=RadarService.SaveViolationRequest.newBuilder();
        builder.setRadarID(1)
                .setMaxSpeed(100)
                .setRegistrationNumber(2345678)
                .setCarSpeed(200)
                .setDate(new Date().toString())
                .setPenalty(new Random().nextInt(100,1000));

        RadarService.SaveViolationRequest saveViolationRequest=builder.build();


        /*RadarGrpcServiceGrpc.RadarGrpcServiceBlockingStub blockingStub=RadarGrpcServiceGrpc.newBlockingStub(managedChannel);
        RadarService.SaveViolationResponse saveViolationResponse=blockingStub.generateViolation(saveViolationRequest);

        System.out.println("*************************");
        System.out.println(saveViolationResponse.getViolation().getRadarID());*/

        RadarGrpcServiceGrpc.RadarGrpcServiceStub radarGrpcServiceStub=RadarGrpcServiceGrpc.newStub(managedChannel);
        radarGrpcServiceStub.generateViolation(saveViolationRequest, new StreamObserver<RadarService.SaveViolationResponse>(){

            @Override
            public void onNext(RadarService.SaveViolationResponse saveViolationResponse) {
                System.out.println("*************************");
                System.out.println(saveViolationResponse.getViolation().getRadarID());
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println(throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Violation created");
            }
        });
    }
}
