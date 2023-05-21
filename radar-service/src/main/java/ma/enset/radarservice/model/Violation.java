package ma.enset.radarservice.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


import java.util.Date;


@Data @Builder
@AllArgsConstructor
public class Violation {

    private long id;
    private Date date;
    private long radarID ;
    private int registrationNumber;
    private int carSpeed;
    private int maxSpeed;
    private double penalty;
}
