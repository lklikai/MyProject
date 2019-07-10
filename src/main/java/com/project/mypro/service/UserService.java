package com.project.mypro.service;

import com.project.mypro.entity.User;
import com.project.mypro.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: 用户Service层
 * @author: Mr.Li
 * @create: 2019-07-10 10:40
 **/
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User userDetail(int userid){
        User user = userMapper.getUserDetail(userid);
        return user;
    }
}
