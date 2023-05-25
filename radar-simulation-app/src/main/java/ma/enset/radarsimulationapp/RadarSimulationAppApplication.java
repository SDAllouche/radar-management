package ma.enset.radarsimulationapp;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import ma.enset.radarsimulationapp.model.Car;
import ma.enset.radarsimulationapp.model.Radar;
import ma.enset.radarsimulationapp.service.CarService;
import ma.enset.radarsimulationapp.service.RadarService;
import ma.enset.radarsimulationapp.stub.ViolationGrpcServiceGrpc;
import ma.enset.radarsimulationapp.stub.ViolationService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;
import java.util.Random;

@SpringBootApplication
@EnableFeignClients
public class RadarSimulationAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RadarSimulationAppApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CarService carService, RadarService radarService){
		return args -> {

			ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 9999)
					.usePlaintext().build();

			//ViolationGrpcServiceGrpc.ViolationGrpcServiceStub stub=ViolationGrpcServiceGrpc.newStub(managedChannel);

			ViolationGrpcServiceGrpc.ViolationGrpcServiceBlockingStub blockingStub=ViolationGrpcServiceGrpc.newBlockingStub(managedChannel);

			List<Car> cars=carService.getAllCars();
			List<Radar> radars=radarService.getAllRadars();

			try {
				while (true) {

					Car car =cars.get(new Random().nextInt(cars.size()));
					Radar radar=radars.get(new Random().nextInt(radars.size()));

					ViolationService.generateViolationRequest violation = ViolationService.generateViolationRequest.newBuilder()
							.setRadarID(radar.getId())
							.setCarSpeed(radar.getMaxSpeed()+new Random().nextInt(10,100))
							.setRegistrationNumber(car.getRegistartionNumber())
							.build();

					ViolationService.generateViolationResponse response=blockingStub.generateViolation(violation);



					Thread.sleep(60 * 1000 * 3);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
	}

}
