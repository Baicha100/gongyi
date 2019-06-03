package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;

import com.example.demo.entity.student;

import com.example.demo.servise.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Studen {
    @Autowired
    studentService studentService;
    /*查询所有学生*/
    @GetMapping("/selectALL")
    public String selectAll() {
        List<student> usersList = studentService.selectAll();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("list",usersList);
        return jsonObject.toJSONString();
    }

    /*通过id删除*/
    @GetMapping("/deleteById")
    public void deleteById(@RequestParam("id") int id){
        studentService.deleteById(id);
    }
    /*新增学生*/
    @PostMapping("/insertStu")
    public void insertStu(student user){
/*
        student stu = new student();
        stu.setName(name);
        stu.setSex(sex);
*/
        studentService.insertStu(user);
    }

}
