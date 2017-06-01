package com.zhaoxg.springboot.Dao;

import com.zhaoxg.springboot.bean.Demo;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/6/1.
 */
@Repository
public class DemoDao {

    @Resource
    private JdbcTemplate jdbcTemplate;



    public Demo getById(long id){

        String sql = "select * from base_employee where id =?";
        RowMapper<Demo> rowMapper = new BeanPropertyRowMapper<Demo>(Demo.class);

        return jdbcTemplate.queryForObject(sql,rowMapper,id);
    }
}
