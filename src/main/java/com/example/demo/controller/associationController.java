package com.example.demo.controller;

import com.example.demo.entity.association;
import com.example.demo.servise.associationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class associationController {
    @Autowired
    associationService associationService;
    @GetMapping("/allassociation")
    public List<association> selectAll() {
        List<association> association = associationService.selectAll();
        System.out.println(association);
        return association;
    }

    @GetMapping("/association")
    public association selectById(@RequestParam("id") int id){
        association association=associationService.selectbyid(id);
        return association;
    }

    @GetMapping("/associationlogin")
    public int login(@RequestParam("number") String number,@RequestParam("password") String password){
        int a=0;
        System.out.println(number);
        System.out.println(password);
        association association=associationService.login(number,password);
        if (association!=null){
            a=association.getAssociationid();
        }
        return a;//社团登入成功返回社团编号
    }
}
