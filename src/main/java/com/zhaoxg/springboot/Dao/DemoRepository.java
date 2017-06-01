package com.zhaoxg.springboot.Dao;

import com.zhaoxg.springboot.bean.Demo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/6/1.
 */
public interface DemoRepository extends CrudRepository<Demo,Long> {
}
