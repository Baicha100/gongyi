package com.example.demo.servise;
import com.example.demo.entity.project;
import java.util.List;

public interface projectService {
    /*查询所有公益活动*/
    List<project> selectAll();
    /*通过weichatOpenid查找所有学生*/
    project selectbyid(int id);
}
