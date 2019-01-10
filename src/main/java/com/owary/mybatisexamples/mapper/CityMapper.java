package com.owary.mybatisexamples.mapper;

import com.owary.mybatisexamples.model.City;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CityMapper {

    List<City> getAll();
    City get(Long id);
    void update(City city);
    void delete(Long id);
    void insert(City city);

}
