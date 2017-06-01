package com.zhaoxg.springboot.service;

import com.zhaoxg.springboot.Dao.DemoDao;
import com.zhaoxg.springboot.Dao.DemoRepository;
import com.zhaoxg.springboot.bean.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/6/1.
 */
@Service
public class DemoService {

    @Resource
    private DemoRepository demoRepository;


    @Transactional
    public void save(Demo demo){

        demoRepository.save(demo);
    }


    @Resource
    private DemoDao demoDao;


    public Demo getById(long id){

        return demoDao.getById(id);
    }
}
