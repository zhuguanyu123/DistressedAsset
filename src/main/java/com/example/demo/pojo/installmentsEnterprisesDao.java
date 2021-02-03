package com.example.demo.pojo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel(value = "分期还款企业")
public class installmentsEnterprisesDao {


    /**
     * 分期还款企业名单ID
     */
    private String installmentsEnterprisesId;

    /**
     * 债务人
     */
    private String obligor;

    /**
     * 债权人
     */
    private String creditor;

    /**
     * 应还本金
     */
    private String payablePrincipal;
    /**
     * 还款期限
     */
    private String repaymentTerm;
    /**
     * 企业实际控制人或关键人
     */
    private String actualController;

    /**
     * 还款是否结清
     */
    private String repaymentStatus;

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
