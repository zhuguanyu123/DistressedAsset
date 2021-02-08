package com.example.demo.pojo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel(value = "主表实体类")
public class iouMainDao {


    /**
     * 借据号
     */
    private String iou_id;

    /**
     * 资产包ID
     */
    private String asset_package_id;

    /**
     * 借款合同号
     */
    private String contract_no;

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
    private String original_creditor;

    /**
     * 债权类别
     */
    private String claims_type;

    /**
     * *借款（代偿）日
     */
    private String loan_compensation_date;

    /**
     * *借款（代偿）到期日
     */
    private String loan_compensation_due_date;

    /**
     * 交易日借款本金
     */
    private String principal_of_loan;

    /**
     * 借款年利率
     */
    private String annual_interest_rate;
    /**
     * 逾期罚息年利率
     */
    private String penalty_annual_interest_rate;
    /**
     * 交易日借款利息
     */
    private String loan_interest;

    /**
     * 还款ID
     */
    private String repayment_id;

    /**
     * 是否转让
     */
    private String transfer_type;

    /**
     * 取得成本
     */
    private String acquisition_cost;
    /**
     * 评估价格
     */
    private String valuation_price;

    /**
     * 转让价格
     */
    private String transfer_price;
    /**
     * 债权转让进度
     */
    private String claims_progress;

    /**
     * 备注
     */
    private String remarks;
    /**
     * 删除状态 删除状态 0：正常，1：删除
     */
    private String delete_flag;

    /**
     * 创建人
     */
    private String create_by;

    /**
     * 创建时间
     */
    private String gmt_create;

    /**
     * 更新人
     */
    private String update_by;

    /**
     * 更新时间
     */
    private String gmt_modified;
}
