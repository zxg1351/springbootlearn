package com.zhaoxg.springboot.controller;

import com.zhaoxg.springboot.model.DemoModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/5/25.
 */

@RestController
@RequestMapping(value = "/demo")
public class DemoController {

    @RequestMapping(value = "/getDemo",method = RequestMethod.GET)
    public DemoModel getDemo(){
        DemoModel demoModel = new DemoModel();
        demoModel.setId("1");
        demoModel.setName("zhaoxg测试springboot");
        return demoModel;
    }

}