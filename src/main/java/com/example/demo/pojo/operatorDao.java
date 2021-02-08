package com.example.demo.pojo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel(value = "操作员信息")
public class operatorDao {
    /**
     * 操作员id
     */
    private String operatorNo;

    /**
     * 操作员姓名
     */
    private String operatorName;

    /**
     * 密码
     */
    private String password;
}
