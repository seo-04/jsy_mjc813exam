package com.mjc813.food_web.ingredient_category.service;

import com.mjc813.food_web.common.IIdName;
import com.mjc813.food_web.ingredient_category.dto.IngredientCategoryDto;
import com.mjc813.food_web.ingredient_category.dto.IngredientCategoryEntity;
import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class IngredientCategoryService {

    @Autowired
    private IngredientCategoryMapper mapper;

    @Autowired
    private IngredientCategoryRepository repository;

    // 등록 (JPA)
    public IIdName insertRepository(IngredientCategoryDto dto) {
        IngredientCategoryEntity entity = new IngredientCategoryEntity();
        entity.setName(dto.getName());
        return repository.save(entity);
    }

    // 수정 (JPA)
    public IIdName updateRepository(IngredientCategoryDto dto) throws Exception {
        IngredientCategoryEntity entity = repository.findById(dto.getId())
                .orElseThrow(() -> new NotFoundException("Category not found"));
        entity.setName(dto.getName());
        return repository.save(entity);
    }

    // 삭제 (JPA)
    public Boolean deleteRepository(Long id) {
        repository.deleteById(id);
        return true;
    }

    // 단건 조회 (JPA)
    public IIdName findByIdRepository(Long id) throws Exception {
        return repository.findById(id)
                .orElseThrow(() -> new NotFoundException("Category not found"));
    }

    // 전체 조회 (JPA)
    public List<IIdName> findAllRepository() {
        return repository.findAllByOrderByIdDesc().stream().map(e -> (IIdName) e).toList();
    }
}
