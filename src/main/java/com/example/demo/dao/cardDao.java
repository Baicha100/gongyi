package com.example.demo.dao;


import com.example.demo.entity.card;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface cardDao {
    /*查询所有帖子*/
    List<card> selectAll();
    /*通过id查找帖子*/
    card selectbyid(int id);
    /*新增帖子*/
    void addcard(card card);
}
