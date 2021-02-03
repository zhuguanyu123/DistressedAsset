package com.example.demo.pojo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel(value = "以物抵债债务清单")
public class debtForPropertyDao {

    /**
     * 以物抵债清单ID
     */
    private String debtForProperty;

    /**
     * 案号
     */
    private String caseId;

    /**
     * 抵押物ID
     */
    private String collateralId;

    /**
     * 转让时本金余额
     */
    private String transferPrincipalBalance;

    /**
     * 被执行人
     */
    private String executee;

    /**
     * 法律文书原件
     */
    private String legalDocument;

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
