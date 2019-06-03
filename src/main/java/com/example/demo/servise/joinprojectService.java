package com.example.demo.servise;

import com.example.demo.entity.joinproject;

import java.util.List;

public interface joinprojectService {
    /*查询所有公益活动*/
    List<joinproject> selectAll();
    /*通过openid查找所参加的公益活动*/
    List<joinproject> selectbyid(String studentid);
}
