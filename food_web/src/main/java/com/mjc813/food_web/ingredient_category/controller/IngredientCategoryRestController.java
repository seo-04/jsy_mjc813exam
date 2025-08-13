package com.mjc813.food_web.ingredient_category.controller;

import com.mjc813.food_web.common.*;
import com.mjc813.food_web.ingredient_category.dto.IngredientCategoryDto;
import com.mjc813.food_web.ingredient_category.service.IngredientCategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/v1/ingredient_category")
public class IngredientCategoryRestController extends CommonRestController {

    @Autowired
    private IngredientCategoryService service;

    @PostMapping("")
    public ResponseEntity<ResponseDto> insert(@Validated @RequestBody IngredientCategoryDto dto) {
        try {
            return getReponseEntity(ResponseCode.SUCCESS, "OK", service.insertRepository(dto), null);
        } catch (Throwable th) {
            return getReponseEntity(ResponseCode.INSERT_FAIL, "Error", dto, th);
        }
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ResponseDto> update(@PathVariable Long id, @Validated @RequestBody IngredientCategoryDto dto) {
        try {
            dto.setId(id);
            return getReponseEntity(ResponseCode.SUCCESS, "OK", service.updateRepository(dto), null);
        } catch (Throwable th) {
            return getReponseEntity(ResponseCode.UPDATE_FAIL, "Error", dto, th);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseDto> delete(@PathVariable Long id) {
        try {
            return getReponseEntity(ResponseCode.SUCCESS, "OK", service.deleteRepository(id), null);
        } catch (Throwable th) {
            return getReponseEntity(ResponseCode.DELETE_FAIL, "Error", id, th);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseDto> findById(@PathVariable Long id) {
        try {
            return getReponseEntity(ResponseCode.SUCCESS, "OK", service.findByIdRepository(id), null);
        } catch (Throwable th) {
            return getReponseEntity(ResponseCode.SELECT_FAIL, "Error", id, th);
        }
    }

    @GetMapping("")
    public ResponseEntity<ResponseDto> findAll() {
        try {
            return getReponseEntity(ResponseCode.SUCCESS, "OK", service.findAllRepository(), null);
        } catch (Throwable th) {
            return getReponseEntity(ResponseCode.SELECT_FAIL, "Error", null, th);
        }
    }
}
