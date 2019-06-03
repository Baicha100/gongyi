package com.example.demo.entity;

public class joinproject {
    int joinprojectid;
    String studentid;
    int projectid;
    String jointime;
    int integral;

    public joinproject(int joinprojectid, String studentid, int projectid, String jointime, int integral) {
        this.joinprojectid = joinprojectid;
        this.studentid = studentid;
        this.projectid = projectid;
        this.jointime = jointime;
        this.integral = integral;
    }

    public joinproject(){

    }
}
