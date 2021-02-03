package com.example.demo.pojo;

import io.swagger.annotations.ApiModel;
import lombok.Data;
@Data
@ApiModel(value = "破产债权表")
public class bankruptcyClaimDao {


    /**
     * 破产债权ID
     */
    private String bankruptcyClaimId;

    /**
     * 破产企业
     */
    private String bustEnterprise;

    /**
     * 破产受理日
     */
    private String bankruptcyAcceptanceDate;

    /**
     * 破产管理人
     */
    private String bankruptcyAdministrator;
    /**
     * 债权申报人
     */
    private String claimsDeclarant;
    /**
     * 债权性质
     */
    private String claimsProperties;

    /**
     * 申报金额
     */
    private String declaredAmount;

    /**
     * 核减金额
     */
    private String deductionAmount;

    /**
     * 认定金额
     */
    private String recognizedAmount;

    /**
     * 分配金额
     */
    private String allocationAmount;

    /**
     * 联系人
     */
    private String contacts;

    /**
     * 联系电话
     */
    private String contactNumber;

    /**
     * 备注
     */
    private String remarks;
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
