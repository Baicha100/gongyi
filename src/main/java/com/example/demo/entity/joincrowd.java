package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class joincrowd {
    int joincrowdid;
    String studentid;
    int crowdid;
    String jointime;
    String crowdnumber;
    int integral;

    public joincrowd(int joincrowdid, String studentid, int crowdid, String jointime, String crowdnumber, int integral) {
        this.joincrowdid = joincrowdid;
        this.studentid = studentid;
        this.crowdid = crowdid;
        this.jointime = jointime;
        this.crowdnumber = crowdnumber;
        this.integral = integral;
    }

    public joincrowd(){

    }
}
