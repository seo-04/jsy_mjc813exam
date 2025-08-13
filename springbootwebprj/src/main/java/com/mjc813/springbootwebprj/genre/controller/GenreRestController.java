package com.mjc813.springbootwebprj.genre.controller;

import com.mjc813.springbootwebprj.common.ResponseDto;
import com.mjc813.springbootwebprj.genre.dto.GenreDto;
import com.mjc813.springbootwebprj.genre.dto.GenreEntity;
import com.mjc813.springbootwebprj.genre.dto.IGenre;
import com.mjc813.springbootwebprj.genre.service.GenreRepository;
import com.mjc813.springbootwebprj.genre.service.GenreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/genre")
public class GenreRestController {
    @Autowired
    private GenreRepository genreRepository;
    @Autowired
    private GenreService genreService;

    @PostMapping("")
    public ResponseEntity<ResponseDto> insert(@RequestBody GenreDto dto) {
        try {
            IGenre igenre = this.genreService.insert(dto);
            return ResponseEntity.ok().body(
                    ResponseDto.builder().resultCode(100).message("OK").resultData(igenre).build()
            );
        } catch (Throwable e) {
            log.error(e.toString());
            return ResponseEntity.status(500).body(
                    ResponseDto.builder().resultCode(999).message("ERROR").resultData(dto).build()
            );
        }
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ResponseDto> update(@RequestBody GenreDto dto) {
        try {
            //this.genreRepository.save(entity);
            return ResponseEntity.ok().body(
                    ResponseDto.builder().resultCode(100).message("OK").resultData(dto).build()
            );
        } catch (Throwable e) {
            log.error(e.toString());
            return ResponseEntity.status(500).body(
                    ResponseDto.builder().resultCode(999).message("ERROR").resultData(dto).build()
            );
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseDto> delete(@PathVariable Long id) {
        try {
            this.genreRepository.deleteById(id);
            return ResponseEntity.ok().body(
                    ResponseDto.builder().resultCode(100).message("OK").resultData(id).build()
            );
        } catch (Throwable e) {
            log.error(e.toString());
            return ResponseEntity.status(500).body(
                    ResponseDto.builder().resultCode(999).message("ERROR").resultData(id).build()
            );
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseDto> findById(@PathVariable Long id) {
        try {
            Optional<GenreEntity> find = this.genreRepository.findById(id);
            if (find.isPresent()) {
                return ResponseEntity.ok().body(
                        ResponseDto.builder().resultCode(100).message("OK").resultData(find.orElse(null)).build()
                );
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Throwable e) {
            log.error(e.toString());
            return ResponseEntity.status(500).body(
                    ResponseDto.builder().resultCode(999).message("ERROR").resultData(id).build()
            );
        }
    }

    @GetMapping("")
    public ResponseEntity<ResponseDto> findByNameContains(@RequestParam String name, Pageable pageable) {
        try {
            Page<GenreEntity> list = this.genreRepository.findByNameContains(name, pageable);
            return ResponseEntity.ok().body(
                    ResponseDto.builder().resultCode(100).message("OK").resultData(list).build()
            );
        } catch (Throwable e) {
            log.error(e.toString());
            return ResponseEntity.status(500).body(
                    ResponseDto.builder().resultCode(999).message("ERROR").resultData(null).build()
            );
        }
    }
}
