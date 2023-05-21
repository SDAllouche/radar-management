package ma.enset.radarservice.web.grpc.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import ma.enset.radarservice.entities.Radar;
import ma.enset.radarservice.model.Car;
import ma.enset.radarservice.repositories.RadarRepository;
import ma.enset.radarservice.service.CarService;
import ma.enset.radarservice.web.grpc.RadarGrpcService;
import ma.enset.radarservice.web.grpc.stub.RadarGrpcServiceGrpc;
import ma.enset.radarservice.web.grpc.stub.RadarService;

import java.util.Date;
import java.util.List;
import java.util.Random;

public class RadarGrpcApp {

    static RadarRepository radarRepository;
    static  CarService carService;

    public RadarGrpcApp(RadarRepository radarRepository, CarService carService) {
        this.radarRepository = radarRepository;
        this.carService = carService;
    }

    public static void main(String[] args) {

        ManagedChannel managedChannel= ManagedChannelBuilder.forAddress("localhost",9998)
                .usePlaintext()
                .build();

        List<Car> cars=carService.getAllCars();
        Car car =cars.get(new Random().nextInt(cars.size()));
        List<Radar> radars=radarRepository.findAll();
        Radar radar=radars.get(new Random().nextInt(radars.size()));

        RadarGrpcServiceGrpc.RadarGrpcServiceBlockingStub blockingStub=RadarGrpcServiceGrpc.newBlockingStub(managedChannel);
        RadarService.SaveViolationRequest.Builder builder=RadarService.SaveViolationRequest.newBuilder();
        builder.setRadarID(radar.getId())
                .setMaxSpeed(radar.getMaxSpeed())
                .setRegistrationNumber(car.getRegistartionNumber())
                .setCarSpeed(car.getPower())
                .setDate(new Date().toString())
                .setPenalty(new Random().nextInt(100,1000));

        RadarService.SaveViolationRequest saveViolationRequest=builder.build();
        RadarService.SaveViolationResponse saveViolationResponse=blockingStub.generateViolation(saveViolationRequest);

        System.out.println("*************************");
        System.out.println(saveViolationResponse.getViolation().getRadarID());

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