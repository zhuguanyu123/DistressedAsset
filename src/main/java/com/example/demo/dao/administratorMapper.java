package com.example.demo.dao;

import com.example.demo.pojo.administratorDao;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface administratorMapper {
    int deleteByPrimaryKey(String administratorNo);

    int insert(administratorDao record);

    int insertSelective(administratorDao record);

    administratorDao selectByPrimaryKey(String administratorNo);

    int updateByPrimaryKeySelective(administratorDao record);

    int updateByPrimaryKey(administratorDao record);
}
