package com.isea533.mybatis.mapper;

import com.isea533.mybatis.model.Country;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface CountryMapper extends Mapper<Country> {

    List<Country> selectByCountryQueryModel(Map<String,Object> params);
}