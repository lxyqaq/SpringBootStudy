package com.lxyqaq.boot.controller;

import com.lxyqaq.boot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName MyController
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2021/1/10 22:23
 * @Version 1.0
 */

@RestController
public class MyController {

    @Autowired
    Person person;

    @RequestMapping("/person")
    public Person person() {
        return person;
    }

}
