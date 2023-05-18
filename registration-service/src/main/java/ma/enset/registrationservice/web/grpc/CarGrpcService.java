package ma.enset.registrationservice.web.grpc;

import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ma.enset.registrationservice.dto.CarResponseDTO;
import ma.enset.registrationservice.entities.Car;
import ma.enset.registrationservice.mappers.CarMapper;
import ma.enset.registrationservice.repositories.CarRepository;
import ma.enset.registrationservice.web.grpc.stub.CarGrpcServiceGrpc;
import ma.enset.registrationservice.web.grpc.stub.CarService;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.List;
import java.util.stream.Collectors;

@GrpcService
@Slf4j
@AllArgsConstructor
public class CarGrpcService extends CarGrpcServiceGrpc.CarGrpcServiceImplBase {

    private CarRepository carRepository;
    private CarMapper carMapper;
    @Override
    public void getCar(CarService.GetCarRequest request, StreamObserver<CarService.GetCarResponse> responseObserver) {
        Car car = carRepository.findById(request.getId()).get();
        CarService.Car grpcCar=carMapper.fromCarGrpc(car);
        CarService.GetCarResponse carResponse=CarService.GetCarResponse.newBuilder()
                .setCar(grpcCar)
                .build();
        responseObserver.onNext(carResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getListCars(CarService.GetAllCarsRequest request, StreamObserver<CarService.GetAllCarsResponse> responseObserver) {
        List<Car> carsList = carRepository.findAll();
        CarService.GetAllCarsResponse.Builder carBuilder = CarService.GetAllCarsResponse.newBuilder();
        List<CarService.Car> cars = carsList.stream().map(carMapper::fromCarGrpc).collect(Collectors.toList());
        carBuilder.addAllCar(cars);
        responseObserver.onNext(carBuilder.build());
        responseObserver.onCompleted();
    }
}
