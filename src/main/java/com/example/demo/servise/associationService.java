package com.example.demo.servise;

import com.example.demo.entity.association;

import java.util.List;

public interface associationService {
    /*查询所有社团*/
    List<association> selectAll();
    /*通过id查找社团*/
    association selectbyid(int id);
    /*通过账号密码查找社团*/
    association login(String associationnumber,String associationpassword);
}
