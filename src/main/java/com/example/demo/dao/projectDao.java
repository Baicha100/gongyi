package com.example.demo.dao;
import com.example.demo.entity.project;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface projectDao {
    /*查询所有公益活动*/
    List<project> selectAll();
    /*通过id查找公益活动*/
    project selectbyid(int id);
}
