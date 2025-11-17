package com.jacky.springbootmall.dao;

import com.jacky.springbootmall.dto.UserRegisterRequest;
import com.jacky.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);

}
