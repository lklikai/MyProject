package com.project.mypro.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.mypro.entity.User;
import com.project.mypro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @description: 登录Controller
 * @author: Mr.Li
 * @create: 2019-07-09 23:09
 **/
@Controller
public class LoginController {
    @Autowired
     UserService userService;
    @RequestMapping("/login")
    public String login() throws Exception {
        return "login";
    }
}
