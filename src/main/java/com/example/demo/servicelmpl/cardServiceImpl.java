package com.example.demo.servicelmpl;

import com.example.demo.dao.cardDao;
import com.example.demo.entity.card;
import com.example.demo.servise.cardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class cardServiceImpl implements cardService {
    @Autowired
    cardDao cardDao;
    /*查询所有帖子*/
    @Override
    public List<card> selectAll() {
        return cardDao.selectAll();
    }
    @Override
    /*通过id查找帖子*/
    public card selectbyid(int id) {
        return cardDao.selectbyid(id);
    }
    /*新增学生*/
    @Override
    public void addcard(card card) {
        cardDao.addcard(card);
    }
}
