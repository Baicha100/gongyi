package com.example.demo.servicelmpl;

import com.example.demo.dao.crowdDao;
import com.example.demo.entity.crowd;
import com.example.demo.servise.crowdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class crowdServiceImpl implements crowdService {
    @Autowired
    crowdDao  crowdDao;
    /*查询所有公益活动*/
    @Override
    public List<crowd> selectAll() {
        return crowdDao.selectAll();
    }
    @Override
    /*通过id查找公益活动*/
    public crowd selectbyid(int id) {
        return crowdDao.selectbyid(id);
    }
    @Override
    /*统计众筹活动的条数*/
    public int selectcount() {
        return crowdDao.selectcount();
    }

}
