package com.mjc813.band.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BandDto {
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