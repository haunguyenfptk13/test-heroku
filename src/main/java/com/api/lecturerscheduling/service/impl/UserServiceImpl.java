package com.api.lecturerscheduling.service.impl;

import com.api.lecturerscheduling.dto.UserDTO;
import com.api.lecturerscheduling.mapper.UserMapper;
import com.api.lecturerscheduling.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    private UserMapper userMapper;

    @Override
    public UserDTO login(UserDTO dto){
        String username = dto.getUsername();
        String password = dto.getPassword();
        UserDTO userDTO = userMapper.loginUser(username, password);
        return userDTO;
    }
}
