package ma.enset.violationservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Data
@Builder
public class Violation {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date date;
    private long radarID ;
    private int registrationNumber;
    private int carSpeed;
    private int maxSpeed;
    private double penalty;
}
