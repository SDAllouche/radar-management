package ma.enset.registrationservice.repositories;



import ma.enset.registrationservice.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;


@RepositoryRestResource
public interface CarRepository extends JpaRepository<Car, Long> {


}
