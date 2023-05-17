package ma.enset.registrationservice.repositories;



import ma.enset.registration.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CarRepository extends JpaRepository<Car, Long> {


}
