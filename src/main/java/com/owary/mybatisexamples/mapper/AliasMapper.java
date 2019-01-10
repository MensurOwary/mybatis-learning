package com.owary.mybatisexamples.mapper;

import com.owary.mybatisexamples.model.Alias;
import com.owary.mybatisexamples.model.Superhero;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AliasMapper {

    List<Alias> getAll();
    Alias get(Long id);
    void update(Alias alias);
    void delete(Long id);
    void insert(Alias alias);

}
