package com.roncoo.education.dao;

import com.roncoo.education.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by dajuejinxian on 2018/9/24.
 */
@Repository
public class UserDaoImpl implements UserDao{

    @Autowired
    SqlSessionTemplate sqlSessionTemplate;

    public User findUserById(Integer id){
       return sqlSessionTemplate.selectOne("test.findUserById", id);
    }
}
