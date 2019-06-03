package com.example.demo.dao;
import com.example.demo.entity.student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface studentDao {
    /*查询所有学生*/
    List<student> selectAll();
    /*通过weichatOpenid查找所有学生*/
    student selectAllbyweichat(String studentweichat);
    /*通过id删除*/
    void deleteById(int id);
    /*新增学生*/
    void insertStu(student user);
    /*通过id修改*/
    void updateById(student user);

}
