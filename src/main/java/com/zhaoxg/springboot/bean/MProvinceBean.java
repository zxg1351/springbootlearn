package com.zhaoxg.springboot.bean;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/6/26.
 */


@Data
@Entity
@Table(name = "m_province")
public class MProvinceBean extends BaseInfo{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;


    @Column(name = "province_id")
    private String provinceId;//省ID


    @Column(name = "m_province_name")
    private String mProvinceName;//省名字
}
