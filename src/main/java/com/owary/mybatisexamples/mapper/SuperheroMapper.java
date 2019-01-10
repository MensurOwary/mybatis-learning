package com.owary.mybatisexamples.mapper;

import com.owary.mybatisexamples.model.Superhero;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SuperheroMapper {

    List<Superhero> getAll();
    Superhero get(Long id);
    void update(Superhero superhero);
    void delete(Long id);
    void insert(Superhero superhero);

}
