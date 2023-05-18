package ma.enset.registrationservice.dto;


import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.enset.registrationservice.entities.Car;

import java.util.Date;
import java.util.List;

@Data @NoArgsConstructor
@AllArgsConstructor @Builder
public class OwnerResponseDTO {

    private long id;
    private String name;
    private Date date;
    private String mail;
}
