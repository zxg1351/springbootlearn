package com.zhaoxg.springboot.controller;

import com.zhaoxg.springboot.Repository.AreaRepository;
import com.zhaoxg.springboot.bean.MAreaBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2017/6/26.
 */
@RestController
@RequestMapping(value = "/area")
public class AreaController {


    @Autowired
    private AreaRepository areaRepository;

    @RequestMapping(value = "/getAreaList")
    public List<MAreaBean> getAreaList(){

        List<MAreaBean> mAreaBeans = areaRepository.getAllBy();


        return  mAreaBeans;


    }
}
