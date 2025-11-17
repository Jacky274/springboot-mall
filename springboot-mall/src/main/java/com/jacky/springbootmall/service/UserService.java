package com.jacky.springbootmall.service;

import com.jacky.springbootmall.dto.UserLoginRequest;
import com.jacky.springbootmall.dto.UserRegisterRequest;
import com.jacky.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest) throws Exception;

    User login(UserLoginRequest userLoginRequest);
}
