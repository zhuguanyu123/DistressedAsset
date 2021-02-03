package com.example.demo.pojo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel(value = "资产包")
public class assetPackageDao {
    /**
     * 资产包ID
     */
    private String assetPackageId;

    /**
     * 债权支付对价
     */
    private String debtPayment;

    /**
     * 交易基准日
     */
    private String tradingBaseDate;

    /**
     * 债权人
     */
    private String obligor;

    /**
     * 原债权人
     */
    private String originalCreditor;

    /**
     * 对价支付日
     */
    private String debtPaymentDate;

    /**
     * 对价支付总额
     */
    private String debtPaymentTotal;

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
