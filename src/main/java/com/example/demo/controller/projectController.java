package com.example.demo.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.project;
import com.example.demo.servise.projectService;
import com.example.demo.tool.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class projectController {
    @Autowired
    projectService projectService;
    @GetMapping("/project")
    public String projectController(@RequestParam("id") int id) throws ParseException {
        project pro = projectService.selectbyid(id);
        JSONObject json = new JSONObject();
        SimpleDateFormat simpleDateFormat;
        json.put("projectid",pro.getProjectid());
        json.put("projectname", pro.getProjectname());
        json.put("associationname",pro.getAssociationname());
        json.put("brief",pro.getBrief());
        json.put("targetnumber",pro.getTargetnumber());
        json.put("alreadynumber",pro.getAlreadynumber());
        json.put("projectplace",pro.getProjectplace());
        json.put("projectperson",pro.getProjectperson());
        json.put("requirement",pro.getRequirement());
        json.put("range",pro.getRange());
        json.put("content",pro.getContent());
        json.put("projectintegral",pro.getProjectintegral());
        json.put("projecttime",pro.getProjecttime());
        json.put("image",Address.ADDRESS+pro.getImage());
        json.put("phone",pro.getPhone());
        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = simpleDateFormat.parse(pro.getStartime());
        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        json.put("startime",simpleDateFormat.format(date));
        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date1 = simpleDateFormat.parse(pro.getEndtime());
        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        json.put("endtime",simpleDateFormat.format(date));
        return json.toString();
    }

    @GetMapping("/allproject")
    public String selectAll() throws ParseException {
        List<project> projects = projectService.selectAll();
        int number = projects.size();
        project pro;
        JSONArray jsonArray = new JSONArray();
        JSONObject json = new JSONObject();
        SimpleDateFormat simpleDateFormat;
        for (int i = 0; i < number; i++){
            json = new JSONObject();
            pro = projects.get(i);
            json.put("projectid",pro.getProjectid());
            json.put("projectname", pro.getProjectname());
            json.put("associationname",pro.getAssociationname());
            json.put("targetnumber",pro.getTargetnumber());
            json.put("alreadynumber",pro.getAlreadynumber());
            json.put("image",pro.getImage());
            simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            Date date = simpleDateFormat.parse(pro.getStartime());
            simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            json.put("startime",simpleDateFormat.format(date));
            simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            Date date1 = simpleDateFormat.parse(pro.getEndtime());
            simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            json.put("endtime",simpleDateFormat.format(date));
            jsonArray.add(json);
        }
        return jsonArray.toString();
    }
}
