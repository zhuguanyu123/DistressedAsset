package com.example.demo.service;

import com.aliyun.djcloud.common.base.ResultResponse;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.dao.CreditInfoMapper;
import com.example.demo.pojo.iouMainDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CreditInfoService {

    @Resource
    private CreditInfoMapper creditInfoMapper;
    public Page<iouMainDao> getCreditList(int size ,int current){

        Page page = new Page(current, size);
        Page<iouMainDao> voPage = creditInfoMapper.getCreditList(page);

        return voPage;
    }
}
