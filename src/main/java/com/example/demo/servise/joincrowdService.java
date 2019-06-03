package com.example.demo.servise;

import com.example.demo.entity.joincrowd;

import java.util.List;

public interface joincrowdService {
    /*查询所有众筹参加*/
    List<joincrowd> selectAll();
    /*通过openid查找所参加的众筹*/
    List<joincrowd> selectbyid(String studentid);
}
