package com.roncoo.education.mapper;

import com.roncoo.education.pojo.QueryVo;
import com.roncoo.education.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by dajuejinxian on 2018/9/24.
 */
@Mapper
public interface UserMapper {

    User findUserById(Integer id);

    List<User> findUserByQuery(QueryVo vo);

    Integer countUser();

    //根据性别和名称
    List<User> selectUserBySexAndUserName(User user);

//    List<User> selectuserByIds(Integer[] ids);

    List<User> selectuserByIds(List<Integer> ids);
//
    List<User> selectuserByIds2(QueryVo queryVo);
}
