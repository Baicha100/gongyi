package com.example.demo.dao;

import com.example.demo.entity.joinproject;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface joinprojectDao {
    /*查询所有公益活动*/
    List<joinproject> selectAll();
    /*通过openid查找所参加的公益活动*/
    List<joinproject> selectbyid(String studentid);
}
