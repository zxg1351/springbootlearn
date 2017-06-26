package com.zhaoxg.springboot.bean;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/6/26.
 */

@Data
@Entity
@Table(name = "m_area")
public class MAreaBean extends BaseInfo {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;



    @Column(name = "m_area_id")
    private String mAreaId;


    @Column(name = "m_area_name")
    private String mAreaName;

    @Column(name = "m_city_id")
    private Integer mCityId;

// `m_area_id` varchar(45) DEFAULT NULL,
//  `m_area_name` varchar(45) DEFAULT NULL,
//  `m_city_id` int(11) DEFAULT NULL,


}
