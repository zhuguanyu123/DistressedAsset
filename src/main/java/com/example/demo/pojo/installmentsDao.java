package com.example.demo.pojo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel(value = "分期还款情况")
public class installmentsDao {


    /**
     * 分期还款ID
     */
    private String installmentsId;

    /**
     * 分期还款企业名单ID
     */
    private String installmentsEnterprisesId;

    /**
     * 还款金额
     */
    private String repaymentMoney;

    /**
     * 还款方式
     */
    private String repaymentType;

    /**
     * 支付人
     */
    private String payer;

    /**
     * 收款人
     */
    private String payee;

    /**
     * 还款时间
     */
    private String repaymentTime;

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
