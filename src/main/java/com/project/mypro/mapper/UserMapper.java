package com.project.mypro.mapper;

import com.project.mypro.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description: 用户管理Mapper
 * @author: Mr.Li
 * @create: 2019-07-10 10:39
 **/
@Repository
public interface UserMapper {
     User getUserDetail(int userid);

}
