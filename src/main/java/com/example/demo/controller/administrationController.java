package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class administrationController {
    @GetMapping("/administrationlogin")
    public int login(@RequestParam("number") String number, @RequestParam("password") String password){
        int a=0;
        System.out.println(number);
        System.out.println(password);
        if (number.equals("admin")&&password.equals("123")){
            a=123;
        }
        System.out.println(a);
        return a;//管理员登入成功返回123
    }
}
