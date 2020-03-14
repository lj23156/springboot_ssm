package com.liujie.springboot_ssm.controller;

import com.liujie.springboot_ssm.entity.User;
import com.liujie.springboot_ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {

    @Autowired
    UserService service;

    @RequestMapping("/register")
    public String register(String username, String password, Model model){
        System.out.println("username: " + username + "," + "password:" + password);

        Integer result = service.register(new User(username, password));
        System.out.println("___________________resutl: " + result);
        if(result > 0){
            return "success";
        }
        return "failure";
    }
}
