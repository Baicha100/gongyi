package com.example.demo.entity;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
/*学生表的实例化*/
public class student {
    int studentid;
    String studentweichat;
    String studentname;
    String studentphone;
    String studentschool;
    String studentnumber;
    int studentintegral;
    String studentsex;
    String studentmajor;
    String studentgrade;

    public student(int studentid, String studentweichat, String studentname, String studentphone, String studentschool, String studentnumber, int studentintegral, String studentsex, String studentmajor, String studentgrade) {
        this.studentid = studentid;
        this.studentweichat = studentweichat;
        this.studentname = studentname;
        this.studentphone = studentphone;
        this.studentschool = studentschool;
        this.studentnumber = studentnumber;
        this.studentintegral = studentintegral;
        this.studentsex = studentsex;
        this.studentmajor = studentmajor;
        this.studentgrade = studentgrade;
    }

    public student(){
    }

}
