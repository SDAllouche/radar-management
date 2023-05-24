package ma.enset.registrationservice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.enset.registrationservice.entities.Owner;

@Data @NoArgsConstructor
@AllArgsConstructor @Builder
public class CarRequestDTO {

    private int registartionNumber;
    private String brand;
    private int power;
    private int model;
    private OwnerRequestDTO owner;

}
