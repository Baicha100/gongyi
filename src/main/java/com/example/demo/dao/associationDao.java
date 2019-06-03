package com.example.demo.dao;

import com.example.demo.entity.association;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface associationDao {
    /*查询所有社团*/
    List<association> selectAll();
    /*通过id查找社团*/
    association selectbyid(int id);
    /*通过账号密码查找社团*/
    association login(@Param("associationnumber") String associationnumber,@Param("associationpassword") String associationpassword);
}
