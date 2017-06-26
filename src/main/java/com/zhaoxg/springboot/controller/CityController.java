package com.zhaoxg.springboot.controller;

import com.zhaoxg.springboot.Repository.CityRepository;
import com.zhaoxg.springboot.bean.MCityBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2017/6/26.
 */
@RestController
@RequestMapping(value = "/city")
public class CityController {

    @Autowired
    private CityRepository cityRepository;


    @RequestMapping(value = "/readByCity")
    public List<MCityBean> readByCity(){

        return cityRepository.readAllBy();

    }


}
