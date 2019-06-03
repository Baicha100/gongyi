package com.example.demo.servicelmpl;

import com.example.demo.dao.joincrowdDao;
import com.example.demo.entity.joincrowd;
import com.example.demo.servise.joincrowdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class joincrowdServiceImpl implements joincrowdService {
    @Autowired
    joincrowdDao joincrowdDao;
    /*查询所有公益活动*/
    @Override
    public List<joincrowd> selectAll() {
        return joincrowdDao.selectAll();
    }
    @Override
    /*通过openid查找所参加的公益活动*/
    public List<joincrowd> selectbyid(String studentid) {
        return joincrowdDao.selectbyid(studentid);
    }
}
