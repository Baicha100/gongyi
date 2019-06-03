package com.example.demo.servise;

import com.example.demo.entity.card;

import java.util.List;

public interface cardService {
    /*查询所有帖子*/
    List<card> selectAll();
    /*通过id查找帖子*/
    card selectbyid(int id);
    /*新增帖子*/
    void addcard(card card);
}
