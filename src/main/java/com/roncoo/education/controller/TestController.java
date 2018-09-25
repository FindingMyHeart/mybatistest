package com.roncoo.education.controller;

import com.roncoo.education.pojo.User;
import com.roncoo.education.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dajuejinxian on 2018/9/24.
 */
@RestController
public class TestController {

    @Autowired
    UserService service;

    @RequestMapping("test/{id}")
    public User getUser(@PathVariable("id") Integer id){

        return service.findUserById(id);
    }

}
