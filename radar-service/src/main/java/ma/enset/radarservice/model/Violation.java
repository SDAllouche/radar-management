package ma.enset.radarservice.model;


import lombok.Data;


import java.util.Date;


@Data
public class Violation {

    private long id;
    private Date date;
    private long radarID ;
    private int registrationNumber;
    private int carSpeed;
    private int maxSpeed;
    private double penalty;
}
