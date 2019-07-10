package com.project.mypro.entity;

/**
 * @description: 用户
 * @author: Mr.Li
 * @create: 2019-07-10 10:44
 **/
public class User {
    private int userid;
    private String username;
    private String password;
    private String address;
    private int age;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
