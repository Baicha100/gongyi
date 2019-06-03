package com.example.demo.servicelmpl;

import com.example.demo.dao.associationDao;
import com.example.demo.entity.association;
import com.example.demo.servise.associationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class associationServiceImpl implements associationService {
    @Autowired
    associationDao associationDao;
    /*查询所有帖子*/
    @Override
    public List<association> selectAll() {
        return associationDao.selectAll();
    }
    @Override
    /*通过id查找帖子*/
    public association selectbyid(int id) {
        return associationDao.selectbyid(id);
    }
    /*通过账号密码查找社团*/
    public association login(String associationnumber,String associationpassword) {
        return associationDao.login(associationnumber,associationpassword);
    }
}
