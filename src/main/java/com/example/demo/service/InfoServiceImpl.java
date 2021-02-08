package com.example.demo.service;

import com.example.demo.dao.InfoDao;
import com.example.demo.dao.InfoService;
import com.example.demo.pojo.Info;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


public class InfoServiceImpl implements InfoService {
    @Resource
    InfoDao dao;
    @Override
    public Info queryByName(String username){
        return dao.queryByName(username);
    }
}
