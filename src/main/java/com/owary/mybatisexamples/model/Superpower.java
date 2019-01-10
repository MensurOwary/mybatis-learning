package com.owary.mybatisexamples.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Superpower {

    private Long id;
    private String superpower;

    public Superpower(String superpower) {
        this.superpower = superpower;
    }
}
