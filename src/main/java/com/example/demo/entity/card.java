package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
/*帖子表实例化*/
public class card {
    int cardid;
    String studentweichat;
    String cardtitle;
    String cardtime;
    String cardcontent;
    int pageview;
    int comment;
    String type;

    public card(int cardid, String studentweichat, String cardtitle, String cardtime, String cardcontent, int pageview, int comment, String type) {
        this.cardid = cardid;
        this.studentweichat = studentweichat;
        this.cardtitle = cardtitle;
        this.cardtime = cardtime;
        this.cardcontent = cardcontent;
        this.pageview = pageview;
        this.comment = comment;
        this.type = type;
    }

    public card(){

    }
}
