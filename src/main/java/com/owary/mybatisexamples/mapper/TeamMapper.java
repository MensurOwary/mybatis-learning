package com.owary.mybatisexamples.mapper;

import com.owary.mybatisexamples.model.Superhero;
import com.owary.mybatisexamples.model.Team;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TeamMapper {

    List<Team> getAll();
    Team get(Long id);
    void update(Team team);
    void delete(Long id);
    void insert(Team team);

}
