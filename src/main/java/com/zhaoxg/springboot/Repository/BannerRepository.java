package com.zhaoxg.springboot.Repository;

import com.zhaoxg.springboot.bean.MBannerBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/6/13.
 */
@Repository
public interface BannerRepository extends JpaRepository<MBannerBean,Integer>{




//    List<MBannerBean> findAll();



}
