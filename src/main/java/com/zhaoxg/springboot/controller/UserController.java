package com.zhaoxg.springboot.controller;

import com.google.gson.Gson;
import com.zhaoxg.springboot.Repository.UserRepository;
import com.zhaoxg.springboot.bean.UserBean;
import com.zhaoxg.springboot.bean.UserLoginBean;
import com.zhaoxg.springboot.utils.SecurityUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

/**
 * Created by Administrator on 2017/6/6.
 */
@RestController
@RequestMapping("/user")
public class UserController {

//    private final Logger

    @Value("${crypt.key}")
    private String cryptKey;

    @Autowired
    private UserRepository userRepository;
        Gson gson = new Gson();

    /**
     * 用户登录
     * @param userName
     * @param userPassword
     * @return
     */
    @RequestMapping(value = "/userLogin" ,method = RequestMethod.GET)
        public String userLogin(String userName,String userPassword){
            UserBean result = new UserBean();
            if (StringUtils.isEmpty(userName)){
                result.setResultMessage("用户名不能为空");
            }

            if (StringUtils.isEmpty(userPassword)){
                result.setResultMessage("密码不能为空");
            }

            try {
                userPassword = SecurityUtil.createSHA1(cryptKey.concat(SecurityUtil.decodeBase64(userPassword)));
            } catch (Exception e) {
                e.printStackTrace();
            }

            List<UserBean>  userBeans = userRepository.findByMUserAccountAndMUserPassword(userName,userPassword);
            if (CollectionUtils.isEmpty(userBeans)){
                result.setResultMessage("用户名或密码错误");
            }else{
                result.setId(userBeans.get(0).getId());
                result.setResultMessage("登录成功");
                result.setResultCode("0");
            }
            return gson.toJson(result);
        }

    /**
     * 用户注册
     * @param userName
     * @param userPassword
     * @param userTelphone
     * @return
     */
        @RequestMapping(value = "/registerUser",method = RequestMethod.GET)
        public String registerUser(String userName,String userPassword,String userTelphone){
            UserBean userBean = new UserBean();


            if (StringUtils.isEmpty(userTelphone)){//账号
                userBean.setResultMessage("用户名不能为空");
            }

            userBean.setMUserAccount(userTelphone);
            if (StringUtils.isEmpty(userPassword)){
                userBean.setResultMessage("密码不能为空");
            }
            try {
                userPassword = SecurityUtil.createSHA1(cryptKey.concat(SecurityUtil.decodeBase64(userPassword)));
            } catch (Exception e) {
                e.printStackTrace();
            }
            userBean.setMUserPassword(userPassword);

            userBean.setMUserName(userName);


            UserBean a= userRepository.save(userBean);
            if (a !=null){

                userBean.setResultCode("0");
                userBean.setResultMessage("注册成功");
            }else {

                userBean.setResultCode("1");
                userBean.setResultMessage("注册失败");

            }
            return  gson.toJson(userBean);


        }



        @RequestMapping(value = "/userList")
    public List<UserBean> getUserList(){

            List<UserBean>  userBeans = userRepository.findAll();

            return userBeans;
        }
//    @RequestMapping(value = "/userLoginPostTest" ,method = RequestMethod.GET)
//    public String userLoginPostTest(@RequestParam  UserLoginBean post){
//
////        UserLoginBean userLoginBean = gson.fromJson(post,UserLoginBean.class);
//            if (null!=post){
//        UserLoginBean userLoginBean1 = new UserLoginBean();
//        userLoginBean1.setResultCode("0");
//        userLoginBean1.setResultMessage("测试POST请求登录成功");
//        userLoginBean1.setUserName(post.getUserName());
//        userLoginBean1.setUserPassword(post.getUserPassword());
//        result = gson.toJson(userLoginBean1);
//            }
//        return result;
//    }
//
//
//    @RequestMapping(value = "/userLoginPost",method = RequestMethod.POST)
//    public String userLoginPost(@RequestBody UserLoginBean userBean){
//        UserBean userBean1 = new UserBean();
//
//        userBean1.setMUserAccount(userBean.getUserName());
//        userBean1.setMUserPassword(userBean.getUserPassword());
//
//            userBean1  =  userRepository.save(userBean1);
//          if (null !=userBean1){
//
//              userBean1.setResultCode("0");
//              userBean1.setResultMessage("success");
//
//          }else {
//              userBean1.setResultCode("0");
//              userBean1.setResultMessage("fail");
//          }
//
//        return gson.toJson(userBean1);
//    }
//    private boolean checkLogin(String userName,String userPassword){
//
//        UserBean result = new UserBean();
//
//        if (StringUtils.isEmpty(userName)){
//
//            result.setResultMessage("用户名不能为空");
////            return result;
//        }
//
//        if (StringUtils.isEmpty(userPassword)){
//            result.setResultMessage("密码不能为空");
//        }
//
//        try {
//            userPassword = SecurityUtil.createSHA1(cryptKey.concat(SecurityUtil.decodeBase64(userPassword)));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        List<UserBean>  userBeans = userRepository.findByMUserAccountAndMUserPassword(userName,userPassword);
//        if (CollectionUtils.isEmpty(userBeans)){
//            result.setResultMessage("用户名或密码错误");
//        }else{
//
//
//            result.setResultMessage("登录成功");
//            result.setResultCode("0");
//        }
//             return  false;
//    }
}

