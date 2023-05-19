package ma.enset.radarservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
@AllArgsConstructor @Builder
public class RadarRequestDTO {

    private int maxSpeed;
    private double longitude ;
    private double latitude;

}
