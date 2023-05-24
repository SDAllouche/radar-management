package ma.enset.radarsimulationapp.model;


import jakarta.persistence.Transient;
import lombok.Data;


@Data
public class Car {


    private long id;
    private int registartionNumber;
    private String brand;
    private int power;
    private int model;
    @Transient
    private Owner owner;
}
