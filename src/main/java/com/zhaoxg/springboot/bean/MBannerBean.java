package com.zhaoxg.springboot.bean;


import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Administrator on 2017/6/13.
 */
@Data
@Entity
@Table(name = "m_banner")
public class MBannerBean extends BaseInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "m_banner_name")
    private String mBannerName; //varchar(45) DEFAULT NULL COMMENT '轮播图名称',
    @Column(name = "m_banner_url")
    private String mBannerUrl; //varchar(45) DEFAULT NULL COMMENT '轮播图URL',
    @Column(name = "m_banner_type")
    private String mBannerType;// char(1) DEFAULT '0' COMMENT '默认值为0',
    @Column(name = "create_time")
    private Date createTime;// datetime DEFAULT NULL,
    @Column(name = "create_user")
    private Integer createUser;//int(11) DEFAULT NULL,
    @Column(name = "update_time")
    private Date updateTime; //datetime; DEFAULT NULL,
    @Column(name = "update_user")
    private Integer updateUser;// int(11) DEFAULT NULL,
    @Column(name = "del_flag")
    private String delFlag;// char(1) DEFAULT '0' COMMENT '删除标识0,1',


}
