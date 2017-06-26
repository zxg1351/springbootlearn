package com.zhaoxg.springboot.Repository;

import com.zhaoxg.springboot.bean.MProvinceBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/6/26.
 */
@Repository
public interface ProvinceRepository extends JpaRepository<MProvinceBean,Integer> {

    List<MProvinceBean> findAll();

//    List<MProvinceBean>  readAll();
//
//    List<MProvinceBean> getAllBy();
    List<MProvinceBean> getAllBy();



}
