package com.example.demo.pojo;
import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel(value = "质押物信息")
public class pledgesDao {

    /**
     * 质押物ID
     */
    private String pledgesId;
    /**
     * 质押物名称
     */
    private String pledgesName;

    /**
     * 质押物价值
     */
    private String pledgesValue;

    /**
     * 担保ID
     */
    private String guaranteeId;

    /**
     * 删除状态 删除状态 0：正常，1：删除
     */
    private String deleteFlag;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 创建时间
     */
    private String gmtCreate;

    /**
     * 更新人
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private String gmtModified;
}
