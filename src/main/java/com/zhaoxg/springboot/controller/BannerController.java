package com.zhaoxg.springboot.controller;

import com.google.gson.Gson;
import com.zhaoxg.springboot.Repository.BannerRepository;
import com.zhaoxg.springboot.bean.MBannerBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2017/6/13.
 */
@RestController
@RequestMapping(value = "/banner",name = "")
public class BannerController {



    @Autowired
    private BannerRepository bannerRepository;
    Gson gson = new Gson();
    String result = "";
    @RequestMapping(value = "/findAllBanner",method = RequestMethod.GET,name = "TEST")
//    @RequestMapping(name = "")
    public String  findAllBanner(){

      List<MBannerBean> mBannerBeans = bannerRepository.findAll();
      if (mBannerBeans.size()>0)
      {

          for (int i = 0; i < mBannerBeans.size(); i++) {
              result = mBannerBeans.get(i).getMBannerUrl();

          }
      }else {

          result = "查询相关URL失败";
      }
        return result;
//        return gson.toJson(mBannerBeans);
    }
}
