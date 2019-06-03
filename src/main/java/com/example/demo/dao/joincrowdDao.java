package com.example.demo.dao;

import com.example.demo.entity.joincrowd;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface joincrowdDao {
    /*查询所有众筹参加*/
    List<joincrowd> selectAll();
    /*通过openid查找所参加的众筹*/
    List<joincrowd> selectbyid(String studentid);
}
