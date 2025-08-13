package com.mjc813.band.service;

//import com.example.bandclub.dto.BandDto;
//import com.example.bandclub.entity.BandEntity;
//import com.example.bandclub.repository.BandRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BandService {

    private final BandRepository bandRepository;

    public BandDto create(BandDto dto) {
        BandEntity entity = BandEntity.builder()
                .name(dto.getName())
                .leader(dto.getLeader())
                .guitarFirst(dto.getGuitarFirst())
                .guitarSecond(dto.getGuitarSecond())
                .drum(dto.getDrum())
                .bass(dto.getBass())
                .keyboard(dto.getKeyboard())
                .vocal(dto.getVocal())
                .build();
        BandEntity saved = bandRepository.save(entity);
        dto.setId(saved.getId());
        return dto;
    }

    public List<BandDto> getAll() {
        return bandRepository.findAll().stream().map(entity ->
                BandDto.builder()
                        .id(entity.getId())
                        .name(entity.getName())
                        .leader(entity.getLeader())
                        .guitarFirst(entity.getGuitarFirst())
                        .guitarSecond(entity.getGuitarSecond())
                        .drum(entity.getDrum())
                        .bass(entity.getBass())
                        .keyboard(entity.getKeyboard())
                        .vocal(entity.getVocal())
                        .build()
        ).collect(Collectors.toList());
    }

    public BandDto update(Long id, BandDto dto) {
        BandEntity entity = bandRepository.findById(id).orElseThrow();
        entity.setName(dto.getName());
        entity.setLeader(dto.getLeader());
        entity.setGuitarFirst(dto.getGuitarFirst());
        entity.setGuitarSecond(dto.getGuitarSecond());
        entity.setDrum(dto.getDrum());
        entity.setBass(dto.getBass());
        entity.setKeyboard(dto.getKeyboard());
        entity.setVocal(dto.getVocal());
        bandRepository.save(entity);
        dto.setId(entity.getId());
        return dto;
    }

    public void delete(Long id) {
        bandRepository.deleteById(id);
    }
}