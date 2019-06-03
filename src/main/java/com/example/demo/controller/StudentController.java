package com.example.demo.controller;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.joincrowd;
import com.example.demo.entity.joinproject;
import com.example.demo.entity.student;
import com.example.demo.servise.joincrowdService;
import com.example.demo.servise.joinprojectService;
import com.example.demo.servise.studentService;
import com.example.demo.utils.GetOpenid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class StudentController {
    @Autowired
    studentService studentService;
    @Autowired
    joincrowdService joincrowdService;
    @Autowired
    joinprojectService joinprojectService;
    /*获取openid*/
    @GetMapping("/test")
    public String test(@RequestParam("code") String code) {
        String openId= GetOpenid.getOpenId(code);
        System.out.print(openId);
        student stu = studentService.selectAllbyweichat(openId);
        if (stu==null){
            System.out.print(openId);
            student user=new student();
            user.setStudentweichat(openId);
            studentService.insertStu(user);
        }
        List<joincrowd> joincrowd = joincrowdService.selectbyid(openId);
        int joincrowdnumber = joincrowd.size();
        List<joinproject> joinproject = joinprojectService.selectbyid(openId);
        int joinprojectnumber = joinproject.size();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("openId",stu.getStudentweichat());
        jsonObject.put("studentintegral",stu.getStudentintegral());
        jsonObject.put("joincrowdnumber",joincrowdnumber);
        jsonObject.put("joinprojectnumber",joinprojectnumber);
        return jsonObject.toString();
    }
    /*通过openid查找全部的学生信息*/
    @GetMapping("/studentbyopenid")
    public String studentbyopenid(@RequestParam("openid") String openid) {
        student stu = studentService.selectAllbyweichat(openid);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("openId",stu.getStudentid());
        jsonObject.put("weicha",stu.getStudentweichat());
        jsonObject.put("name",stu.getStudentname());
        jsonObject.put("phone",stu.getStudentphone());
        jsonObject.put("school",stu.getStudentschool());
        jsonObject.put("number",stu.getStudentnumber());
        jsonObject.put("integral",stu.getStudentintegral());
        jsonObject.put("sex",stu.getStudentsex());
        jsonObject.put("major",stu.getStudentmajor());
        jsonObject.put("grade",stu.getStudentgrade());
        return jsonObject.toString();
    }
    /*通过openid修改学生信息*/
    @GetMapping("/changestudentbyopenid")
    public void updateById(@RequestParam("openId") String openId,@RequestParam("name") String name,
                           @RequestParam("phone") String phone,@RequestParam("school") String school,
                           @RequestParam("sno") String sno,@RequestParam("major") String major,
                           @RequestParam("sex") String sex,@RequestParam("grade") String grade
                           ) {
        student student = new student();
        student.setStudentweichat(openId);
        student.setStudentname(name);
        student.setStudentphone(phone);
        student.setStudentgrade(grade);
        student.setStudentsex(sex);
        student.setStudentmajor(major);
        student.setStudentnumber(sno);
        student.setStudentschool(school);
        studentService.updateById(student);

    }
}
