package com.example.demo.servise;

import com.example.demo.entity.crowd;

import java.util.List;

public interface crowdService {
    /*查询所有众筹活动*/
    List<crowd> selectAll();
    /*通过id查找众筹活动*/
    crowd selectbyid(int id);
    /*统计众筹活动的条数*/
    int selectcount();
}
