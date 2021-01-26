package com.example.demo.Service.imp;

import com.example.demo.Domain.User;
import com.example.demo.Repository.UserRepository;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImp implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getList(){
        List<User> users =userRepository.findAll();
        return users;
    }

    @Override
    public List<User> findUser(String name, String password) {
        List<User> user =userRepository.findUser(name,password);
        return user;
    }
}
