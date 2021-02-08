package com.example.demo.dao;
import com.example.demo.pojo.administratorDao;
import com.example.demo.pojo.operatorDao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface operatorMapper {
    int deleteByPrimaryKey(String administratorNo);

    int insert(administratorDao record);

    int insertSelective(administratorDao record);

    operatorDao selectByPrimaryKey(String studentno);


    int updateByPrimaryKeySelective(administratorDao record);

    int updateByPrimaryKey(administratorDao record);
}
