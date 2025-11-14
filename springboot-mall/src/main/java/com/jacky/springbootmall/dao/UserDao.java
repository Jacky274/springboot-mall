package com.jacky.springbootmall.dao;

import com.jacky.springbootmall.dto.UserRegisterRequest;
import com.jacky.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    Integer createUser(UserRegisterRequest userRegisterRequest);

}
