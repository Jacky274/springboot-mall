package com.jacky.springbootmall.service.impl;

import com.jacky.springbootmall.dao.UserDao;
import com.jacky.springbootmall.dto.UserRegisterRequest;
import com.jacky.springbootmall.model.User;
import com.jacky.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) throws Exception {
        return userDao.createUser(userRegisterRequest);
    }

}
