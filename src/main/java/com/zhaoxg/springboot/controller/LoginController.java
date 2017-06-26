package com.zhaoxg.springboot.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2017/6/26.
 */

@RestController(value = "/")
public class LoginController {

    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();

        return new ModelAndView("login");
    }

}
