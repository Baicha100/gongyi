package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
/*众筹表的实例化*/
public class crowd {
    int crowdid;
    String title;
    int crowdnumber;
    String startime;
    String endtime;
    String content;
    String suffername;
    String patient;
    int crowdintegral;
    String targetmoney;
    String way;
    String donationway;
    String contact;
    String donationnumber;
    int pageview;

    public crowd(int crowdid, String title, int crowdnumber, String startime, String endtime, String content, String suffername, String patient, int crowdintegral, String targetmoney, String way, String donationway, String contact, String donationnumber, int pageview) {
        this.crowdid = crowdid;
        this.title = title;
        this.crowdnumber = crowdnumber;
        this.startime = startime;
        this.endtime = endtime;
        this.content = content;
        this.suffername = suffername;
        this.patient = patient;
        this.crowdintegral = crowdintegral;
        this.targetmoney = targetmoney;
        this.way = way;
        this.donationway = donationway;
        this.contact = contact;
        this.donationnumber = donationnumber;
        this.pageview = pageview;
    }

    public crowd(){

    }
}
