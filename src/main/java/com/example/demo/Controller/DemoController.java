package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
public class DemoController {
    @RequestMapping("/testSpringBoot")
    @ResponseBody
    public String testSpringBoot(){
        return "我起飞了";
    }
}
