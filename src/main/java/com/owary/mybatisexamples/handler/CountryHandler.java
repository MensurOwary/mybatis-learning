package com.owary.mybatisexamples.handler;

import com.owary.mybatisexamples.model.Country;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedTypes(Country.class)
public class CountryHandler implements TypeHandler<Country> {

    @Override
    public void setParameter(PreparedStatement preparedStatement,
                             int i,
                             Country country,
                             JdbcType jdbcType) throws SQLException {
        if(country != null){
            byte[] ctrbytes = country.name().getBytes();
            preparedStatement.setBytes(i, ctrbytes);
        }
    }

    @Override
    public Country getResult(ResultSet resultSet, String s) throws SQLException {
        String string = resultSet.getString(s);
        return Enum.valueOf(Country.class, string);
    }

    @Override
    public Country getResult(ResultSet resultSet, int i) throws SQLException {
        String string = resultSet.getString(i);
        return Enum.valueOf(Country.class, string);
    }

    @Override
    public Country getResult(CallableStatement callableStatement, int i) throws SQLException {
        String string = callableStatement.getString(i);
        return Enum.valueOf(Country.class, string);
    }
}
