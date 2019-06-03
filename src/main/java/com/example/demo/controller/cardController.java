package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.card;
import com.example.demo.servise.cardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class cardController {
    @Autowired
    cardService cardService;
    /*查询所有的帖子*/
    @GetMapping("/allcard")
    public List<card> selectAll() {
        List<card> count = cardService.selectAll();
        return count;
    }
    /*通过id查询帖子*/
    @GetMapping("/card")
    public String crowdController(@RequestParam("id") int id) throws ParseException {
        card card = cardService.selectbyid(id);
        JSONObject json = new JSONObject();
        json.put("cardid",card.getCardid());
        json.put("studentweichat",card.getStudentweichat());
        json.put("cardtitle",card.getCardtitle());
        json.put("cardcontent",card.getCardcontent());
        json.put("pageview",card.getPageview());
        json.put("comment",card.getComment());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = simpleDateFormat.parse(card.getCardtime());
        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        json.put("cardtime",simpleDateFormat.format(date));
        return json.toString();
    }
    /*增加帖子*/
    @GetMapping("/addcard")
    public void addcard(@RequestParam("openid") String openid, @RequestParam("type") String type,
                        @RequestParam("time") String time,@RequestParam("title") String title,
                        @RequestParam("content") String content,@RequestParam("pageview") int pageview,
                        @RequestParam("comment") int comment) {
        card card = new card();
        card.setStudentweichat(openid);
        card.setType(type);
        card.setCardtime(time);
        card.setCardtitle(title);
        card.setCardcontent(content);
        card.setPageview(pageview);
        card.setComment(comment);
        cardService.addcard(card);
    }
}
