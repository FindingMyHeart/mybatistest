package com.roncoo.education.pojo;

import java.util.Date;

/**
 * Created by dajuejinxian on 2018/9/24.
 */
public class CustomOrder extends Orders{


    private Integer id;
    private Integer userId;
    private String number;
    private Date createtime;
    private String note;
    private User user;

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public Integer getUserId() {
        return userId;
    }

    @Override
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public Date getCreatetime() {
        return createtime;
    }

    @Override
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String getNote() {
        return note;
    }

    @Override
    public void setNote(String note) {
        this.note = note;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
