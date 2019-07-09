package com.project.mypro.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 登录Controller
 * @author: Mr.Li
 * @create: 2019-07-09 23:09
 **/
@RestController
public class LoginController {
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
}
