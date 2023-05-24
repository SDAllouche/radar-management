package ma.enset.radarservice.service;


import ma.enset.radarservice.entities.Radar;
import ma.enset.radarservice.mappers.RadarMapper;
import ma.enset.radarservice.dto.RadarRequestDTO;
import ma.enset.radarservice.dto.RadarResponseDTO;
import ma.enset.radarservice.repositories.RadarRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service @Transactional
public class RadarServiceImpl implements RadarService {

    private RadarRepository radarRepository;
    private RadarMapper radarMapper;

    public RadarServiceImpl(RadarRepository radarRepository,RadarMapper radarMapper) {
        this.radarRepository = radarRepository;
        this.radarMapper = radarMapper;
    }

    @Override
    public List<RadarResponseDTO> getAllRadars() {
        List<RadarResponseDTO> radarResponseDTOS =new ArrayList<>();
        List<Radar> radars = radarRepository.findAll();
        radars.forEach(c->{
            RadarResponseDTO radarResponseDTO = radarMapper.fromRadar(c);
            radarResponseDTOS.add(radarResponseDTO);
        });
        return radarResponseDTOS;
    }

    @Override
    public RadarResponseDTO getRadar(long id) {
        Radar radar = radarRepository.findById(id).orElseThrow(()-> new RuntimeException(String.format("Radar %s not found",id)));
        RadarResponseDTO radarResponseDTO = radarMapper.fromRadar(radar);
        return radarResponseDTO;
    }

    @Override
    public RadarResponseDTO addRadar(RadarRequestDTO radarRequestDTO) {
        Radar radar = Radar.builder()
                .maxSpeed(radarRequestDTO.getMaxSpeed())
                .longitude(radarRequestDTO.getLongitude())
                .latitude(radarRequestDTO.getLatitude())
                .build();

        Radar saved = radarRepository.save(radar);

        RadarResponseDTO radarResponseDTO = radarMapper.fromRadar(saved);

        return radarResponseDTO;
    }

    @Override
    public RadarResponseDTO updateRadar(RadarRequestDTO radarRequestDTO, long id) {
        Radar radar=radarRepository.findById(id).orElseThrow();
        radar.setMaxSpeed(radarRequestDTO.getMaxSpeed());
        radar.setLatitude(radarRequestDTO.getLatitude());
        radar.setLongitude(radarRequestDTO.getLongitude());
        Radar savedRadar=radarRepository.save(radar);
        RadarResponseDTO radarResponseDTO=radarMapper.fromRadar(savedRadar);

        return radarResponseDTO;
    }

    @Override
    public void delete(long id) {
        radarRepository.deleteById(id);
    }


}
