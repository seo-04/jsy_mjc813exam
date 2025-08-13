package com.mjc813.band.Repository;

//import com.example.bandclub.entity.BandEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BandRepository<BandEntity> extends JpaRepository<BandEntity, Long> {
} 