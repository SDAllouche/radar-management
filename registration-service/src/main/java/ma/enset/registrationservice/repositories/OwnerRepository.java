package ma.enset.registrationservice.repositories;


import ma.enset.registration.entities.Owner;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OwnerRepository extends JpaRepository<Owner, Long> {


}
