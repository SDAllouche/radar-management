package ma.enset.radarservice.web.grpc;

import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ma.enset.radarservice.entities.Radar;
import ma.enset.radarservice.mappers.RadarMapper;
import ma.enset.radarservice.model.Violation;
import ma.enset.radarservice.repositories.RadarRepository;
import ma.enset.radarservice.service.ViolationService;
import ma.enset.radarservice.web.grpc.stub.RadarGrpcServiceGrpc;
import ma.enset.radarservice.web.grpc.stub.RadarService;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@GrpcService
@Slf4j
@AllArgsConstructor
public class RadarGrpcService extends RadarGrpcServiceGrpc.RadarGrpcServiceImplBase {

    private RadarRepository radarRepository;
    private RadarMapper radarMapper;
    private ViolationService violationService;

    @Override
    public void getRadar(RadarService.GetRadarRequest request, StreamObserver<RadarService.GetRadarResponse> responseObserver) {
        Radar radar = radarRepository.findById(request.getId()).get();
        RadarService.Radar grpcRadar= radarMapper.fromRadarGrpc(radar);
        RadarService.GetRadarResponse radarResponse=RadarService.GetRadarResponse.newBuilder()
                .setRadar(grpcRadar)
                .build();
        responseObserver.onNext(radarResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getListRadars(RadarService.GetAllRadarsRequest request, StreamObserver<RadarService.GetAllRadarsResponse> responseObserver) {
        List<Radar> radarList = radarRepository.findAll();
        RadarService.GetAllRadarsResponse.Builder radarBuilder = RadarService.GetAllRadarsResponse.newBuilder();
        List<RadarService.Radar> radars = radarList.stream().map(radarMapper::fromRadarGrpc).collect(Collectors.toList());
        radarBuilder.addAllRadar(radars);
        responseObserver.onNext(radarBuilder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void generateViolation(RadarService.SaveViolationRequest request, StreamObserver<RadarService.SaveViolationResponse> responseObserver) {
        Violation violation= Violation.builder()
                .radarID(request.getRadarID())
                .maxSpeed((int) request.getMaxSpeed())
                .registrationNumber((int) request.getRegistrationNumber())
                .carSpeed(request.getCarSpeed())
                .date(new Date())
                .penalty(request.getPenalty())
                .build();

        Violation savedViolation=violationService.generateViolation(violation);

        RadarService.Violation grpcViolation=radarMapper.fromViolationGrpc(violation);
        RadarService.SaveViolationResponse response=RadarService.SaveViolationResponse.newBuilder()
                .setViolation(grpcViolation)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
