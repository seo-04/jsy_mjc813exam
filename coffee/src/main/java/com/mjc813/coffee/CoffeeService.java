package com.mjc813.coffee;
import com.mjc813.coffee.dto.coffeeDto;
import com.mjc813.coffee.mapper.CoffeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CoffeeService {
    @Autowired
    private CoffeeMapper mapper;

    public void insert(coffeeDto dto) {
        mapper.insertCoffee(dto);
    }

    public List<coffeeDto> getAll() {
        return mapper.selectAll();
    }

    public void update(coffeeDto dto) {
        mapper.updateCoffee(dto);
    }

    public void delete(int id) {
        mapper.deleteCoffee(id);
    }
}
