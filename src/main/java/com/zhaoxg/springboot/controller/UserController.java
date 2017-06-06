package com.zhaoxg.springboot.controller;

import com.google.gson.Gson;
import com.zhaoxg.springboot.bean.UserLoginBean;
import org.apache.catalina.User;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by Administrator on 2017/6/6.
 */
@RestController
@RequestMapping("/user")
public class UserController {
        Gson gson = new Gson();
        String result ="";
        @RequestMapping(value = "/userLogin" ,method = RequestMethod.GET)
        public String userLogin(String userName,String passWord){


//            if (null!=userLoginBean){
                UserLoginBean userLoginBean1 = new UserLoginBean();
                userLoginBean1.setResultCode("0");
                userLoginBean1.setResultMessage("登录成功");
                userLoginBean1.setUserName(userName);
                userLoginBean1.setUserPassword(passWord);
               result = gson.toJson(userLoginBean1);
//            }
            return result;
        }

    @RequestMapping(value = "/userLoginPostTest" ,method = RequestMethod.GET)
    public String userLoginPostTest(@RequestParam  UserLoginBean post){

//        UserLoginBean userLoginBean = gson.fromJson(post,UserLoginBean.class);
            if (null!=post){
        UserLoginBean userLoginBean1 = new UserLoginBean();
        userLoginBean1.setResultCode("0");
        userLoginBean1.setResultMessage("测试POST请求登录成功");
        userLoginBean1.setUserName(post.getUserName());
        userLoginBean1.setUserPassword(post.getUserPassword());
        result = gson.toJson(userLoginBean1);
            }
        return result;
    }
}
