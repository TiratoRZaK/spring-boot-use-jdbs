package com.luxoft.training.springbootusejdbs.dao;

import com.luxoft.training.springbootusejdbs.models.Country;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CountryRowMapper implements RowMapper<Country> {

    public Country mapRow(ResultSet resultSet, int i) throws SQLException {
        Country country = new Country();
        country.setId(resultSet.getInt("id"));
        country.setName(resultSet.getString("name"));
        country.setCodeName(resultSet.getString("code_name"));
        return country;
    }
}