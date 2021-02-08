package com.example.demo.dao;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.pojo.iouMainDao;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CreditInfoMapper {

    Page<iouMainDao> getCreditList(Page<iouMainDao> page);
}
