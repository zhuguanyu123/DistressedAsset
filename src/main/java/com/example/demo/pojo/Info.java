package com.example.demo.pojo;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "shiro测试")
public class Info implements Serializable {


    /**
     * 管理员姓名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 级别
     */
    private String perm;
}
