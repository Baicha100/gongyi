package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
/*活动表的实例化*/
public class project {
    int projectid;
    String projectname;
    String startime;
    String endtime;
    String brief;
    String associationname;
    int targetnumber;
    int alreadynumber;
    String projectplace;
    String projectperson;
    String requirement;
    String range;
    String content;
    String projecttime;
    int projectintegral;
    String image;
    String phone;

    public project(int projectid, String projectname, String startime, String endtime, String brief, String associationname, int targetnumber, int alreadynumber, String projectplace, String projectperson, String requirement, String range, String content, String projecttime, int projectintegral, String image, String phone) {
        this.projectid = projectid;
        this.projectname = projectname;
        this.startime = startime;
        this.endtime = endtime;
        this.brief = brief;
        this.associationname = associationname;
        this.targetnumber = targetnumber;
        this.alreadynumber = alreadynumber;
        this.projectplace = projectplace;
        this.projectperson = projectperson;
        this.requirement = requirement;
        this.range = range;
        this.content = content;
        this.projecttime = projecttime;
        this.projectintegral = projectintegral;
        this.image = image;
        this.phone = phone;
    }

    public project(){
    }





}
