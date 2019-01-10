package com.owary.mybatisexamples.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Alias {

    private Long id;
    private String name;

    public Alias(String name) {
        this.name = name;
    }
}
