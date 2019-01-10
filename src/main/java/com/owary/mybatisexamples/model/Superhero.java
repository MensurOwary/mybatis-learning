package com.owary.mybatisexamples.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Superhero {

    private Long id;
    private String name;
    private List<Alias> aliases;
    private List<Superpower> superpowers;
    private List<Team> teams;
    private City city;
    private Double height;
    private Double weight;

}
