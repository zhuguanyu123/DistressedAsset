package com.example.demo.dao;

import com.example.demo.pojo.Info;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;
@Service
public interface InfoService {
    Info queryByName (String username);
}
