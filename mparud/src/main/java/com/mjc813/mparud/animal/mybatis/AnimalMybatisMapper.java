package com.mjc813.mparud.animal.mybatis;

import com.mjc813.mparud.animal.dto.AnimalDto;
import com.mjc813.mparud.animal.dto.SearchRequestDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper // resources/mapper/**/*.xml 파일중에서
// <mapper namespace
public interface AnimalMybatisMapper {
    public void insertAnimal(AnimalDto animalDto);
    public List<AnimalDto> findAll();
    public AnimalDto findById(Long id);
    public void update(AnimalDto dto);
    public void delete(Long id);
    public List<AnimalDto> findWhere(SearchRequestDto search);
}
