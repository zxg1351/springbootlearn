package com.zhaoxg.springboot.controller;

import com.google.gson.Gson;
import com.zhaoxg.springboot.model.DemoModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/5/25.
 */

@RestController
@RequestMapping(value = "/demo")
public class DemoController {


    private final static Logger logger= LoggerFactory.getLogger(DemoController.class);
    @RequestMapping(value = "/getDemo",method = RequestMethod.GET)
    public String getDemo(){
        DemoModel demoModel = new DemoModel();
        demoModel.setId("1");
        demoModel.setName("zhaoxg测试springboot");
        Gson gson = new Gson();
        logger.info("logback成功");
        logger.debug("logback debug成功了");
        logger.error("logback error成功了");
        return  gson.toJson(demoModel);
    }

    @RequestMapping(value = "/zeroException")
    public  int zeroException(){

        return  100/0;
    }


    @RequestMapping(value = "/testLog")
    public void logTest(){
        logger.debug("日志输出测试 Debug");
        logger.trace("日志输出测试 Trace");
        logger.info("日志输出测试 Info");
    }

}
