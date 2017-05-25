package com.zhaoxg.springboot.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/5/25.
 */
public class DemoModel implements Serializable {
    private String id;//主键
    private String name;//测试名称

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
