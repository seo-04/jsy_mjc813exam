package com.mjc813.coffee.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class coffeeDto {
    private int id;
    private String name;
    private int price;
    private String source;
    private int shots;
}
