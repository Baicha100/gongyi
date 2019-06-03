package com.example.demo.servicelmpl;
import com.example.demo.dao.projectDao;
import com.example.demo.entity.project;
import com.example.demo.servise.projectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class projectServiceImpl implements projectService {
    @Autowired
    projectDao  projectDao;
    /*查询所有公益活动*/
    @Override
    public List<project> selectAll() {
        return projectDao.selectAll();
    }
    @Override
    /*通过id查找公益活动*/
    public project selectbyid(int id) {
        return projectDao.selectbyid(id);
    }
}
