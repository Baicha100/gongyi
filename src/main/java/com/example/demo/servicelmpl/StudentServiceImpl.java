package com.example.demo.servicelmpl;
import com.example.demo.dao.studentDao;
import com.example.demo.entity.student;
import com.example.demo.servise.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentServiceImpl implements studentService {
    @Autowired
    studentDao  studentDao;
    /*查询所有学生*/
    @Override
    public List<student> selectAll() {
        return studentDao.selectAll();
    }
    @Override
    /*通过weichatOpenid查找所有学生*/
    public student selectAllbyweichat(String studentweichat) {
        return studentDao.selectAllbyweichat(studentweichat);
    }
    /*通过id删除*/
    @Override
    public void deleteById(int id) {
        studentDao.deleteById(id);
    }
    /*新增学生*/
    @Override
    public void insertStu(student user) {
        studentDao.insertStu(user);
    }
    /*通过id修改*/
    @Override
    public void updateById(student user) {
        studentDao.updateById(user);
    }
}
