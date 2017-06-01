package com.zhaoxg.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Objects;

/**
 * Created by Administrator on 2017/6/1.
 */
@Controller
public class TemplateController {



    /**
     * 返回html模板.
     */
    @RequestMapping("/helloHtml")
    public String helloHtml(Map<String,Object> map){
        map.put("hello","from TemplateController.helloHtml");
        return "/helloHtml";
    }

    @RequestMapping("/helloTest")
    public String helloTestHtml(Map<String,Object> map){

        map.put("helloTest","from TemplateController.helloTestHtml");
        return "/helloTestHtml";
    }
}
