package com.example.demo.pojo;
import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel(value = "管理者信息")
public class administratorDao {
    /**
     * 管理员id
     */
    private String administratorNo;

    /**
     * 管理员姓名
     */
    private String administratorName;

    /**
     * 密码
     */
    private String password;

    /**
     * 级别
     */
    private String level;
}
