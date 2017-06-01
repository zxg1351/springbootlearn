package com.zhaoxg.springboot.controller;

import com.zhaoxg.springboot.bean.Demo;
import com.zhaoxg.springboot.scheduling.SchedulingConfig;
import com.zhaoxg.springboot.service.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/6/1.
 */
@RestController
@RequestMapping(value = "/demo2")
public class Demo2Controller {

    @Resource
    private DemoService demoService;



    @Resource
    private  SchedulingConfig schedulingConfig;


    @RequestMapping("/save")
    public String saveDemo(){
        schedulingConfig.schedluar();
        Demo demo = new Demo();
        demo.setName("angel");
        demoService.save(demo);
        return "ok.Demo2Controller.save";
    }
    //http://localhost:9090/zxgspring-boot/demo2/getById?id=1
    @RequestMapping("/getById")
    public Demo getById(long id){
       return      demoService.getById(id);
    }
}
