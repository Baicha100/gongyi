package com.example.demo.servicelmpl;

import com.example.demo.dao.joinprojectDao;
import com.example.demo.entity.joinproject;
import com.example.demo.servise.joinprojectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class joinprojectServiceImpl implements joinprojectService {
    @Autowired
    joinprojectDao joinprojectDao;
    /*查询所有公益活动*/
    @Override
    public List<joinproject> selectAll() {
        return joinprojectDao.selectAll();
    }
    @Override
    /*通过openid查找所参加的公益活动*/
    public List<joinproject> selectbyid(String studentid) {
        return joinprojectDao.selectbyid(studentid);
    }
}
