package com.example.demo.dao;

import com.example.demo.pojo.Info;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;
@Mapper
public interface InfoDao {
    @Select("select * from shiro where username=#{username}")
    Info queryByName(String username);
}
