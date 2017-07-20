package com.zwn.service.impl;

import com.zwn.dao.UserMapper;
import com.zwn.model.User;
import com.zwn.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/5/26.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService{
    @Resource
    private UserMapper userDao;

    public List<User> showUser() {
        return userDao.showUser();
    }

    public User selectByPrimaryKey() {
        return userDao.selectByPrimaryKey(1);
    }

    public List<User> login(String username, String password) {
        return userDao.login(username,password);
    }

}
