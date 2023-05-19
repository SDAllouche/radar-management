package ma.enset.violationservice.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data @NoArgsConstructor
@AllArgsConstructor @Builder
public class ViolationResponseDTO {

    private long id;
    private Date date;
    private long radarID ;
    private int registrationNumber;
    private int carSpeed;
    private int maxSpeed;
    private double penalty;
}
