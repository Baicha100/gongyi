package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.crowd;
import com.example.demo.servise.crowdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class crowdController{
    @Autowired
    crowdService crowdService;
    @GetMapping("/crowd")
    public String crowdController(@RequestParam("id") int id) throws ParseException {
        crowd cro = crowdService.selectbyid(id);
        JSONObject json = new JSONObject();
        SimpleDateFormat dateFormat;
        json.put("crowdid",cro.getCrowdid());
        json.put("title",cro.getTitle());
        json.put("crowdnumber",cro.getCrowdnumber());
        json.put("content",cro.getContent());
        json.put("suffername",cro.getSuffername());
        json.put("patient",cro.getPatient());
        json.put("crowdintegral",cro.getCrowdintegral());
        json.put("targetmoney",cro.getTargetmoney());
        json.put("way",cro.getWay());
        json.put("donationway",cro.getDonationway());
        json.put("contact ",cro.getContact());
        json.put("donationnumber",cro.getDonationnumber());
        json.put("pageview",cro.getPageview());
        dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = dateFormat.parse(cro.getStartime());
        dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        json.put("startime",dateFormat.format(date));
        dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date1 = dateFormat.parse(cro.getEndtime());
        dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        json.put("endtime",dateFormat.format(date1));

        return json.toJSONString();
    }
    @GetMapping("/allcrowd")
    public List<crowd> selectAll() {
        List<crowd> count = crowdService.selectAll();
        return count;
    }




    @GetMapping("/count")
    public int crowdController() {
        int count = crowdService.selectcount();
        System.out.println(count);
        return count;
    }
}
