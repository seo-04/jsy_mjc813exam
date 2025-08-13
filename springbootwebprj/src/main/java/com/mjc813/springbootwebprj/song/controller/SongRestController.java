package com.mjc813.springbootwebprj.song.controller;

import com.mjc813.springbootwebprj.common.ResponseDto;
import com.mjc813.springbootwebprj.song.dto.SongEntity;
import com.mjc813.springbootwebprj.song.service.SongRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/song")
public class SongRestController {
    @Autowired
    private SongRepository songRepository;

    @PostMapping("")
    public ResponseEntity<ResponseDto> insert(@RequestBody SongEntity entity) {
        try {
            this.songRepository.save(entity);
            return ResponseEntity.ok().body(
                    ResponseDto.builder().resultCode(100).message("OK")
                            .resultData(entity).build()
            );
        } catch (Throwable e) {
            log.error(e.toString());
            return ResponseEntity.status(500).body(
                    ResponseDto.builder().resultCode(999).message("ERROR")
                            .resultData(entity).build()
            );
        }
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ResponseDto> update(
            @PathVariable Long id
            , @RequestBody SongEntity entity) {
        try {
            if ( entity.getId() == null && !id.equals(entity.getId()) ) {
                return ResponseEntity.status(405).body(
                        ResponseDto.builder().resultCode(999).message("id is null or is not mathing")
                                .resultData(id).build()
                );
            }
            Optional<SongEntity> find = this.songRepository.findById(id);
            if(find.isEmpty()) {
                return ResponseEntity.status(404).body(
                        ResponseDto.builder().resultCode(999).message("id can't find")
                                .resultData(id).build()
                );
            } else {
                entity.setId(id);
                this.songRepository.save(entity);
                return ResponseEntity.ok().body(
                        ResponseDto.builder().resultCode(100).message("OK")
                                .resultData(entity).build()
                );
            }
        } catch (Throwable e) {
            log.error(e.toString());
            return ResponseEntity.status(500).body(
                    ResponseDto.builder().resultCode(999).message("ERROR")
                            .resultData(entity).build()
            );
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseDto> delete(@PathVariable Long id) {
        try {
            Optional<SongEntity> find = this.songRepository.findById(id);
            if(find.isEmpty()) {
                return ResponseEntity.status(404).body(
                        ResponseDto.builder().resultCode(999).message("id can't find")
                                .resultData(id).build()
                );
            } else {
                this.songRepository.deleteById(id);
                return ResponseEntity.ok().body(
                        ResponseDto.builder().resultCode(100).message("OK")
                                .resultData(id).build()
                );
            }
        } catch (Throwable e) {
            log.error(e.toString());
            return ResponseEntity.status(500).body(
                    ResponseDto.builder().resultCode(999).message("ERROR")
                            .resultData(id).build()
            );
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseDto> findById(@PathVariable Long id) {
        try {
            Optional<SongEntity> find = this.songRepository.findById(id);
            if(find.isEmpty()) {
                return ResponseEntity.status(404).body(
                        ResponseDto.builder().resultCode(999).message("id can't find")
                                .resultData(id).build()
                );
            } else {
                return ResponseEntity.ok().body(
                        ResponseDto.builder().resultCode(100).message("OK")
                                .resultData(find.orElse(null)).build()
                );
            }
        } catch (Throwable e) {
            log.error(e.toString());
            return ResponseEntity.status(500).body(
                    ResponseDto.builder().resultCode(999).message("ERROR")
                            .resultData(id).build()
            );
        }
    }

    @GetMapping("")
    public ResponseEntity<ResponseDto> findByTitleContainsAndArtistContains(
            @RequestParam("title") String title
            , @RequestParam("artist") String artist
            , Pageable pageable
    ) {
        try {
            Page<SongEntity> list = this.songRepository.findByTitleContainsAndArtistContains(title, artist, pageable);
            return ResponseEntity.ok().body(
                    ResponseDto.builder().resultCode(100).message("OK")
                            .resultData(list).build()
            );
        } catch (Throwable e) {
            log.error(e.toString());
            return ResponseEntity.status(500).body(
                    ResponseDto.builder().resultCode(999).message("ERROR")
                            .resultData(null).build()
            );
        }
    }
}
