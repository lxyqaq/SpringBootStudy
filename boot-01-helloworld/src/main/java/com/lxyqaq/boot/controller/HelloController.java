package com.lxyqaq.boot.controller;

import com.lxyqaq.boot.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2021/1/8 21:22
 * @Version 1.0
 */

//@ResponseBody
//@Controller

@RestController
public class HelloController {

    @Autowired
    Car car;

    @RequestMapping("/car")
    public Car handle02() {
        return car;
    }

    @RequestMapping("/hello")
    public String handle01() {
        return "Hello , SpringBoot 2 !";
    }



}
