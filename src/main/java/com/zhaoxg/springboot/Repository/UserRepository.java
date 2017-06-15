package com.zhaoxg.springboot.Repository;

import com.zhaoxg.springboot.bean.UserBean;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/6/12.
 */
@Repository
public interface UserRepository extends JpaRepository<UserBean,Integer> {

//    Long countByMUserAccount(String mUserAccount);
//
//    Long deleteByDelFlag(String delFlag);
//
//    List<UserBean> removeByDelFlag(String delFlag);
//
//    List<UserBean> readByMUserAccountAAndMUSERAndMUserPassword(String mUserAccount,String mUserPassword);
//
//    List<UserBean> readByMUserAccountOrOrderByCreateTimeAsc(String mUserAccount, Date createTime);

    List<UserBean> findByMUserAccountAndMUserPassword(String mUserAccount,String mUserPassword);

    UserBean save(UserBean userBean);
}
