package com.zwn.service;

import com.zwn.model.User;

import java.util.List;

/**
 * Created by Administrator on 2017/5/26.
 */
public interface UserService {

    public List<User> showUser();
    public User selectByPrimaryKey();

    public List<User> login(String username,String password);
}
