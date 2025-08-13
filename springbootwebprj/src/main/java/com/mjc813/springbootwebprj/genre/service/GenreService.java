package com.mjc813.springbootwebprj.genre.service;

import com.mjc813.springbootwebprj.genre.dto.GenreDto;
import com.mjc813.springbootwebprj.genre.dto.GenreEntity;
import com.mjc813.springbootwebprj.genre.dto.IGenre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenreService {
    @Autowired
    private GenreRepository genreRepository;

    public IGenre insert(GenreDto dto) {
        if(dto == null) {
            return null;
        }
        // Dto 를 Entity 로 변환 해야만 JpaRepository 가 정상 실행된다.
        GenreEntity entity = GenreEntity.builder()
                .id(dto.getId())
                .name(dto.getName()).build();
        // Dto 를 Entity 로 변환 해야만 JpaRepository 가 정상 실행된다.
        this.genreRepository.save(entity);
        return entity;
    }
}
