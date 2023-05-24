package ma.enset.violationservice.web.grpc;

import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ma.enset.violationservice.entities.Violation;
import ma.enset.violationservice.mappers.ViolationMapper;
import ma.enset.violationservice.model.Car;
import ma.enset.violationservice.model.Radar;
import ma.enset.violationservice.repositories.ViolationRepository;
import ma.enset.violationservice.service.CarService;
import ma.enset.violationservice.service.RadarService;
import ma.enset.violationservice.service.ViolationServiceImpl;
import ma.enset.violationservice.web.grpc.stub.ViolationGrpcServiceGrpc;
import ma.enset.violationservice.web.grpc.stub.ViolationService;
import net.devh.boot.grpc.server.service.GrpcService;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@GrpcService
@Slf4j
@AllArgsConstructor
public class ViolationGrpcService extends ViolationGrpcServiceGrpc.ViolationGrpcServiceImplBase {

    private ViolationRepository violationRepository;
    private ViolationMapper violationMapper;
    private CarService carService;
    private RadarService radarService;

    @Override
    public void getViolation(ViolationService.GetViolationRequest request, StreamObserver<ViolationService.GetViolationResponse> responseObserver) {
        Violation violation=violationRepository.findById(request.getId()).get();
        ViolationService.Violation grpcViolation=violationMapper.fromViolationGrpc(violation);
        ViolationService.GetViolationResponse violationResponse=ViolationService.GetViolationResponse.newBuilder()
                .setViolation(grpcViolation)
                .build();
        responseObserver.onNext(violationResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getListViolations(ViolationService.GetAllViolationsRequest request, StreamObserver<ViolationService.GetAllViolationsResponse> responseObserver) {
        List<Violation> violationList = violationRepository.findAll();
        ViolationService.GetAllViolationsResponse.Builder violationBuilder = ViolationService.GetAllViolationsResponse.newBuilder();
        List<ViolationService.Violation> violations = violationList.stream().map(violationMapper::fromViolationGrpc).collect(Collectors.toList());
        violationBuilder.addAllViolation(violations);
        responseObserver.onNext(violationBuilder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void saveViolation(ViolationService.SaveViolationRequest request, StreamObserver<ViolationService.SaveViolationResponse> responseObserver) {

        Violation violation=new Violation();
        violation.setDate(new Date());
        violation.setRadarID(request.getRadarID());
        violation.setMaxSpeed((int) request.getMaxSpeed());
        violation.setRegistrationNumber((int) request.getRegistrationNumber());
        violation.setCarSpeed(request.getCarSpeed());
        violation.setPenalty(request.getPenalty());

        Violation savedViolation=violationRepository.save(violation);

        ViolationService.Violation grpcViolation=violationMapper.fromViolationGrpc(savedViolation);
        ViolationService.SaveViolationResponse response=ViolationService.SaveViolationResponse.newBuilder()
                .setViolation(grpcViolation)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void generateViolation(ViolationService.GenerateViolationRequest request, StreamObserver<ViolationService.GenerateViolationResponse> responseObserver) {
        Car car=carService.carByRegistreNumber((int) request.getRegistrationNumber());
        Radar radar=radarService.radarByID(request.getRadarID());

        Violation violation=new Violation();
        violation.setDate(new Date());
        violation.setRadarID(request.getRadarID());
        violation.setMaxSpeed(radar.getMaxSpeed());
        violation.setRegistrationNumber((int) request.getRegistrationNumber());
        violation.setCarSpeed(request.getCarSpeed());
        violation.setPenalty(new Random().nextInt(100,1000));

        Violation savedViolation=violationRepository.save(violation);

        ViolationService.Violation grpcViolation=violationMapper.fromViolationGrpc(savedViolation);
        ViolationService.GenerateViolationResponse response=ViolationService.GenerateViolationResponse.newBuilder()
                .setViolation(grpcViolation)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }
}
