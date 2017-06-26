package com.zhaoxg.springboot.bean;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/6/26.
 */

@Data
@Entity
@Table(name = "m_city")
public class MCityBean {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "m_city_id")
    private String mCityId;

    @Column(name = "m_city_name")
    private String mCityName;

    @Column(name = "m_province_id")
    private Integer mProvinceId;
}
