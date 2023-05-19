package ma.enset.radarservice.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Data
@Builder
public class Radar {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int maxSpeed;
    private double longitude ;
    private double latitude;
}
