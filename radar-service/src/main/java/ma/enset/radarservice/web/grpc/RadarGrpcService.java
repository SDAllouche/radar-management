package ma.enset.radarservice.web.grpc;

import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ma.enset.radarservice.entities.Radar;
import ma.enset.radarservice.mappers.RadarMapper;
import ma.enset.radarservice.repositories.RadarRepository;
import ma.enset.radarservice.web.grpc.stub.RadarGrpcServiceGrpc;
import ma.enset.radarservice.web.grpc.stub.RadarService;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.List;
import java.util.stream.Collectors;

@GrpcService
@Slf4j
@AllArgsConstructor
public class RadarGrpcService extends RadarGrpcServiceGrpc.RadarGrpcServiceImplBase {

    private RadarRepository radarRepository;
    private RadarMapper radarMapper;

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
        RadarService.GetAllRadarsResponse.Builder carBuilder = RadarService.GetAllRadarsResponse.newBuilder();
        List<RadarService.Radar> radars = radarList.stream().map(radarMapper::fromRadarGrpc).collect(Collectors.toList());
        carBuilder.addAllRadar(radars);
        responseObserver.onNext(carBuilder.build());
        responseObserver.onCompleted();
    }
}
