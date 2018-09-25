package com.roncoo.education.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by dajuejinxian on 2018/9/24.
 */
public class QueryVo{

    private User user;

    Integer ids[];

    List<Integer> idsList;

    public Integer[] getIds() {
        return ids;
    }

    public void setIds(Integer[] ids) {
        this.ids = ids;
    }

    public List<Integer> getIdsList() {
        return idsList;
    }

    public void setIdsList(List<Integer> idsList) {
        this.idsList = idsList;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
