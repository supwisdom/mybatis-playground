package com.supwisdom.mappers;

import com.supwisdom.model.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CityMapper {

  List<City> findByState(@Param("state") String state);

}
