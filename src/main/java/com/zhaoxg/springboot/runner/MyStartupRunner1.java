package com.zhaoxg.springboot.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/6/2.
 */
@Component
@Order(value = 1)
public class MyStartupRunner1 implements ApplicationRunner {
//    @Override
//    public void run(String... args) throws Exception {
//    }
//        System.out.println(">>>>>>>>>>>>>>>服务启动执行，执行加载数据等操作2222222222222222222222222<<<<<<<<<<<<<");

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(">>>>>>>>>>>>>>>服务启动执行，执行加载数据等操作application2222222222222222222222222<<<<<<<<<<<<<");
    }
}
