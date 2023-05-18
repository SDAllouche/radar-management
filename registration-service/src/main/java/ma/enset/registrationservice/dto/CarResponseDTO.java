package ma.enset.registrationservice.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.enset.registrationservice.entities.Owner;

import java.util.Date;

@Data @NoArgsConstructor
@AllArgsConstructor @Builder
public class CarResponseDTO {

    private long id;
    private int registartionNumber;
    private int power;
    private int model;
    private OwnerResponseDTO ownerResponseDTO;
}
