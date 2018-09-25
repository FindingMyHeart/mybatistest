package com.roncoo.education.mapper;

import com.roncoo.education.pojo.Orders;
import com.roncoo.education.pojo.User;
import org.springframework.core.annotation.Order;

import java.util.List;

/**
 * Created by dajuejinxian on 2018/9/24.
 */
public interface OrderMapper {

    List<Orders> selectOrdersList();

    //一对一关联查询

    List<Orders> selectOrders();

    //一对多关联
    List<User> selectUserList();

}
