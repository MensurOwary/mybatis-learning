package com.owary.mybatisexamples.controller;

import com.owary.mybatisexamples.mapper.*;
import com.owary.mybatisexamples.model.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private SuperheroMapper superheroMapper;
    private SuperpowerMapper superpowerMapper;
    private TeamMapper teamMapper;
    private AliasMapper aliasMapper;
    private CityMapper cityMapper;

    public MainController(SuperheroMapper superheroMapper,
                          SuperpowerMapper superpowerMapper,
                          TeamMapper teamMapper,
                          AliasMapper aliasMapper,
                          CityMapper cityMapper) {
        this.superheroMapper = superheroMapper;
        this.superpowerMapper = superpowerMapper;
        this.teamMapper = teamMapper;
        this.aliasMapper = aliasMapper;
        this.cityMapper = cityMapper;
    }

    @GetMapping("/")
    public String check(){
        return "Works";
    }

    @GetMapping("/persist")
    public Superhero persist(){
        City gotham = new City("Gotham", Country.US);

        cityMapper.insert(gotham);

        Alias batman = new Alias("The Batman");
        Alias knight = new Alias("The Dark Knight");
        Alias crusader = new Alias("The Caped Crusader");

        aliasMapper.insert(batman);
        aliasMapper.insert(knight);
        aliasMapper.insert(crusader);

        Superpower detective = new Superpower("Detective");
        Superpower combat = new Superpower("Hand to hand combat");
        Superpower science = new Superpower("Scientist");

        superpowerMapper.insert(detective);
        superpowerMapper.insert(combat);
        superpowerMapper.insert(science);

        Team jl = new Team("Justice League", Country.US);
        Team batmanInc = new Team("Batman Inc.", Country.US);

        teamMapper.insert(jl);
        teamMapper.insert(batmanInc);

        Superhero superhero = new Superhero();

        superhero.setName("Bruce Wayne");
        superhero.setHeight(1.98D);
        superhero.setWeight(98.0D);
        superhero.setCity(cityMapper.get(1L));
        superhero.setTeams(teamMapper.getAll());
        superhero.setSuperpowers(superpowerMapper.getAll());
        superhero.setAliases(aliasMapper.getAll());

        superheroMapper.insert(superhero);

        return superheroMapper.get(1L);
    }

    @GetMapping("/persisted/{id}")
    public Superhero persisted(@PathVariable("id") Long id)
    {
        return superheroMapper.get(id);
    }



}
