package com.zhaoxg.springboot.controller;

import com.zhaoxg.springboot.Repository.ProvinceRepository;
import com.zhaoxg.springboot.bean.MProvinceBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2017/6/26.
 */
@RestController
@RequestMapping(value = "/province")
public class ProvinceController {


    @Autowired
    private ProvinceRepository provinceRepository;

    @RequestMapping(value = "/findProvince")
    public List<MProvinceBean> findProvince(){


        List<MProvinceBean> list = provinceRepository.findAll();

        return  list;

    }

    @RequestMapping(value = "/getAllBy")
    public List<MProvinceBean>  getAllBy(){

        List<MProvinceBean> mProvinceBeans = provinceRepository.getAllBy();

        return mProvinceBeans;

    }

}
