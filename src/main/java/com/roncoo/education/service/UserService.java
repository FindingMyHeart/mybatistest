package com.roncoo.education.service;

import com.roncoo.education.dao.UserDao;
import com.roncoo.education.mapper.UserMapper;
import com.roncoo.education.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by dajuejinxian on 2018/9/24.
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public User findUserById(Integer id){
//        return userDao.findUserById(id);

        UserMapper userMapper = sqlSessionTemplate.getMapper(UserMapper.class);
        User user = userMapper.findUserById(id);
        return user;

    }

}
