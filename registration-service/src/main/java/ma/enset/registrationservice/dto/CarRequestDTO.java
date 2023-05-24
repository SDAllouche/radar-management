package ma.enset.registrationservice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.ManyToOne;
import lombok.*;
import ma.enset.registrationservice.entities.Owner;

@Data @NoArgsConstructor
@AllArgsConstructor @Builder
@ToString
public class CarRequestDTO {

    private int registartionNumber;
    private String brand;
    private int power;
    private int model;
    private Owner owner;

}
