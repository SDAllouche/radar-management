package ma.enset.radarservice.service;


import ma.enset.radarservice.dto.RadarRequestDTO;
import ma.enset.radarservice.dto.RadarResponseDTO;

import java.util.List;

public interface RadarService {

    public List<RadarResponseDTO> getAllRadars();
    public RadarResponseDTO getRadar(long id);

    public RadarResponseDTO addRadar(RadarRequestDTO radarRequestDTO);

    public RadarResponseDTO updateRadar(RadarRequestDTO radarRequestDTO,long id);

    public void delete(long id);
}
