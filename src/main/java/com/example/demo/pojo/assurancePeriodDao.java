package com.example.demo.pojo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel(value = "保证期间更新信息")
public class assurancePeriodDao {

    /**
     * 保证期间ID
     */
    private String assurancePeriodId;

    /**
     * 保证期间起始日
     */
    private String assuranceStartDate;

    /**
     * 保证期间截止日
     */
    private String assuranceEndDate;

    /**
     * 保证期间提醒时效
     */
    private String assuranceReminderDate;
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
