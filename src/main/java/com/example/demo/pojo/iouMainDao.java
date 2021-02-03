package com.example.demo.pojo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel(value = "主表实体类")
public class iouMainDao {


    /**
     * 借据号
     */
    private String iouId;

    /**
     * 资产包ID
     */
    private String assetPackageId;

    /**
     * 借款合同号
     */
    private String contractNo;

    /**
     * 债务人
     */
    private String obligor;
    /**
     * 所在镇区
     */
    private String region;
    /**
     * 债权人
     */
    private String creditor;

    /**
     * 原债权人
     */
    private String originalCreditor;

    /**
     * 债权类别
     */
    private String claimsType;

    /**
     * *借款（代偿）日
     */
    private String loanCompensationDate;

    /**
     * *借款（代偿）到期日
     */
    private String loanCompensationDueDate;

    /**
     * 交易日借款本金
     */
    private String principalOfLoan;

    /**
     * 借款年利率
     */
    private String annualInterestRate;
    /**
     * 逾期罚息年利率
     */
    private String penaltyAnnualInterestRate;
    /**
     * 交易日借款利息
     */
    private String loanInterest;

    /**
     * 还款ID
     */
    private String repaymentId;

    /**
     * 是否转让
     */
    private String transferType;

    /**
     * 取得成本
     */
    private String acquisitionCost;
    /**
     * 评估价格
     */
    private String valuationPrice;

    /**
     * 转让价格
     */
    private String transferPrice;
    /**
     * 债权转让进度
     */
    private String claimsProgress;

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
