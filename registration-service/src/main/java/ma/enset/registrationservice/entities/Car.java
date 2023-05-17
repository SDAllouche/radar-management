package ma.enset.registrationservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Data
@Builder
public class Car {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int registartionNumber;
    private int power;
    private int model;
    @ManyToOne
    private Owner owner;
}
