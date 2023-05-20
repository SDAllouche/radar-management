package ma.enset.radarservice.model;


import lombok.Builder;
import lombok.Data;


import java.util.Date;


@Data @Builder
public class Violation {

    private long id;
    private Date date;
    private long radarID ;
    private int registrationNumber;
    private int carSpeed;
    private int maxSpeed;
    private double penalty;
}
