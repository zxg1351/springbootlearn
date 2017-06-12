package com.zhaoxg.springboot.Repository;

import com.zhaoxg.springboot.bean.UserBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/6/12.
 */
@Repository
public interface UserRepository extends JpaRepository<UserBean,Integer> {
}
