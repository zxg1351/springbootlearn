package com.zhaoxg.springboot.Repository;

import com.zhaoxg.springboot.bean.MCityBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/6/26.
 */
@Repository
public interface CityRepository extends JpaRepository<MCityBean,Integer> {

    List<MCityBean> readAllBy();

}
