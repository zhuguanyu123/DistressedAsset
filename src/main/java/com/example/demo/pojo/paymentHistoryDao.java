package com.example.demo.pojo;
import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel(value = "还款记录")
public class paymentHistoryDao {


    /**
     * 还款ID
     */
    private String repaymentId;
    /**
     * 借据号
     */
    private String iouId;

    /**
     * 还款时间
     */
    private String repaymentDate;

    /**
     * 还款本金金额
     */
    private String repaymentPrincipalAmount;

    /**
     * 还款利息金额
     */
    private String repaymentInterestAmount;
    /**
     * 支付方式
     */
    private String payType;
    /**
     * 付款人
     */
    private String drawee;

    /**
     * 收款人
     */
    private String payee;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 以物抵债清单ID
     */
    private String debtForPropertyId;
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
