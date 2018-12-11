package com.isea533.mybatis.service;

import com.isea533.mybatis.model.Country;

import java.util.List;
import java.util.Map;

/**
 * @author liuzh_3nofxnp
 * @since 2015-09-19 17:17
 */
public interface CountryService extends IService<Country> {

    /**
     * 根据条件分页查询
     *
     * @param country
     * @param page
     * @param rows
     * @return
     */
    List<Country> selectByCountry(Country country, int page, int rows);

    /**
     * 测试xml查询
     * @param params
     * @return
     */
    List<Country> selectByCountryQueryModel(Map<String,Object> params);

}
