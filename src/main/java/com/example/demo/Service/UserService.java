package com.example.demo.Service;

import com.example.demo.Domain.User;

import java.util.List;

public interface UserService {
    //获取用户列表
    List<User> getList();

    //查询用户
    List<User> findUser(String name,String password);

}
