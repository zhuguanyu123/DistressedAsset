package com.example.demo.pojo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel(value = "担保信息")
public class guaranteeDao {

    /**
     * 担保与借据信息唯一ID
     */
    private String guaranteeIouId;

    /**
     * 借据ID
     */
    private String iouId;

    /**
     * 担保ID
     */
    private String guaranteeId;

    /**
     * 担保方式
     */
    private String guaranteeMethod;
    /**
     * 担保提醒时效
     */
    private String reminderDay;
    /**
     * 备注
     */
    private String note;

    /**
     * 担保期间起始日
     */
    private String guaranteeStartDate;

    /**
     * 担保期间截止日
     */
    private String guaranteeEndDate;

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
