package ma.enset.violationservice.model;

import jakarta.persistence.Transient;
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
    @Transient
    private  Car car;
    @Transient
    private Radar radar;
}
