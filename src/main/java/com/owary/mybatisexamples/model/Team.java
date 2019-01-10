package com.owary.mybatisexamples.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Team {

    private Long id;
    private String name;
    private Country country;

    public Team(String name, Country country) {
        this.name = name;
        this.country = country;
    }
}
