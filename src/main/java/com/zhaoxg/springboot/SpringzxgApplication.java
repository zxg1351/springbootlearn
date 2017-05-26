package com.zhaoxg.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/5/25.
 */

@RestController
@SpringBootApplication
public class SpringzxgApplication implements EmbeddedServletContainerCustomizer{


//    @RequestMapping("/")
//    public  String hello(){
//
//        return "Hello world!";
//    }
    public static void main(String[] args){
        SpringApplication.run(SpringzxgApplication.class,args);
    }


    public void customize(ConfigurableEmbeddedServletContainer container) {
//        container.setPort(8090);
    }
}
