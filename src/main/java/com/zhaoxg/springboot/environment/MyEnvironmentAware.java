package com.zhaoxg.springboot.environment;

import com.zhaoxg.springboot.bean.AuthorSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * Spring Boot环境变量读取和属性对象的绑定
 * Created by Administrator on 2017/6/2.
 */
@SuppressWarnings("ALL")
@Configuration
public class MyEnvironmentAware implements EnvironmentAware {

    @Value("${spring.datasource.username}")
    private String userName;


    @Autowired
    private AuthorSettings authorSettings;

    @Override
    public void setEnvironment(Environment environment) {

        //通过 environment 同样能获取到application.properties配置的属性.
        System.out.println(environment.getProperty("spring.datasource.url"));
        //通过 environment 获取到系统属性.
        System.out.println(environment.getProperty("JAVA_HOME"));
        //打印注入的属性信息.
        System.out.println(userName);


        //获取到前缀是"spring.datasource." 的属性列表值.
        RelaxedPropertyResolver relaxedPropertyResolver = new RelaxedPropertyResolver(environment,"spring.datasource.");

        System.out.println(relaxedPropertyResolver.getProperty("username"));
        System.out.println(relaxedPropertyResolver.getProperty("driverClassName"));


        System.out.println("配置文件内容显示：" + "姓名："+authorSettings.getName()+"年龄"+authorSettings.getAge());

    }
}
