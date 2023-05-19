package ma.enset.violationservice.repositories;


import ma.enset.violationservice.entities.Violation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface ViolationRepository extends JpaRepository<Violation, Long> {


}
