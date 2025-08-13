package com.mjc813.band.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "band_tbl")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BandEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String leader;
    private String guitarFirst;
    private String guitarSecond;
    private String drum;
    private String bass;
    private String keyboard;
    private String vocal;
}