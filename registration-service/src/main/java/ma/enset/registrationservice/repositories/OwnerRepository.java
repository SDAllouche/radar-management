package ma.enset.registrationservice.repositories;



import ma.enset.registrationservice.entities.Owner;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OwnerRepository extends JpaRepository<Owner, Long> {


}
