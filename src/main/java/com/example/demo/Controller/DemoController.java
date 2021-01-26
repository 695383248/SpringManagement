package com.example.demo.Controller;

import com.example.demo.Domain.User;
import com.example.demo.Service.UserService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("/user")
public class DemoController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getUserList")
    @ResponseBody
    @CrossOrigin
    public List<User> testSpringBoot(){
        List<User> user=  userService.getList();
        return user;
    }

    @RequestMapping("/login")
    @ResponseBody
    @CrossOrigin
    public Boolean isUser(@RequestBody User user){
        String name=user.getName();
        String password=user.getPassword();
//        String password =user.getPassword();
        System.out.println("username="+name);
        System.out.println("password="+password);
        List<User> users=userService.findUser(name,password);
        return !users.isEmpty();
    }

    @RequestMapping("/test")
    @ResponseBody
    @CrossOrigin
    public String Test(){
        return "测试";
    }

}
