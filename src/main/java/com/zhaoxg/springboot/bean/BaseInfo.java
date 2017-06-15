package com.zhaoxg.springboot.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/6/6.
 */
@Data
public class BaseInfo implements Serializable {

    private String resultCode;
    private String resultMessage;

}
