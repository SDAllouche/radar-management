package ma.enset.violationservice.model;

import lombok.Data;

@Data
public class Radar {

    private long id;
    private int maxSpeed;
    private double longitude ;
    private double latitude;
}
