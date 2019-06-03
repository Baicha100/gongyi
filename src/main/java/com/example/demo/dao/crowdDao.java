package com.example.demo.dao;

import com.example.demo.entity.crowd;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface crowdDao {
    /*查询所有众筹活动*/
    List<crowd> selectAll();
    /*通过id查找众筹活动*/
    crowd selectbyid(int id);
    /*统计众筹活动的条数*/
    int selectcount();

}
