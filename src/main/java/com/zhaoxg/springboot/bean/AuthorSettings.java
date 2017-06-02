package com.zhaoxg.springboot.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 自定义配置文件时候用不用序列化
 * Created by Administrator on 2017/6/2.
 */
@Data
@Component
@ConfigurationProperties(prefix = "author")
public class AuthorSettings  {

    private String name;
    private Long age;


}
