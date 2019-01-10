package com.owary.mybatisexamples.mapper;

import com.owary.mybatisexamples.model.Superpower;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SuperpowerMapper {

    List<Superpower> getAll();
    Superpower get(Long id);
    void update(Superpower superpower);
    void delete(Long id);
    void insert(Superpower superpower);

}
