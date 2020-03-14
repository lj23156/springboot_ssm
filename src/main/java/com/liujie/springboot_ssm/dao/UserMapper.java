package com.liujie.springboot_ssm.dao;


import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    Integer register(String username, String password);
}
