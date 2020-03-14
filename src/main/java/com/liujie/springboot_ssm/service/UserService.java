package com.liujie.springboot_ssm.service;

import com.liujie.springboot_ssm.dao.UserMapper;
import com.liujie.springboot_ssm.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    UserMapper mapper;

    public Integer register(User user){
        return mapper.register(user.getUsername(), user.getPassword());
    }
}
