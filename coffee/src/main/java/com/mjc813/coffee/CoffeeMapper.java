package com.mjc813.coffee;

import com.mjc813.coffee.dto.coffeeDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
public interface CoffeeMapper {
    void insertCoffee(coffeeDto dto);
    List<coffeeDto> selectAll();
    void updateCoffee(coffeeDto dto);
    void deleteCoffee(int id);
}
