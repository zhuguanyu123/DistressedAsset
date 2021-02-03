package com.example.demo.pojo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel(value = "司法信息")
public class judicialInformationDao {
    /**
     * 主键
     */
    private String id;
    /**
     * 借据号
     */
    private String iouId;

    /**
     * 司法状态名称
     */
    private String judicialStatusName;
    /**
     * 之前司法状态ID
     */
    private String priJudicialStatusId;
    /**
     * 案号
     */
    private String caseId;
    /**
     * 法院
     */
    private String court;

    /**
     * 承办法官
     */
    private String chargeJudge;
    /**
     * 受托律所
     */
    private String entrustedLawFirm;
    /**
     * 备注
     */
    private String remarks;
    /**
     * 状态生成日
     */
    private String statusGenerationDate;

    /**
     * 执行时效
     */
    private String executionValidity;

    /**
     * 执行时效起始日
     */
    private String executionValidityStartDate;

    /**
     * 执行时效到期日
     */
    private String executionValidityDueDate;
    /**
     * 执行时效提醒日
     */
    private String executionValidityNoticeDate;

    /**
     * 申请上诉时效
     */
    private String appealLimitationTime;

    /**
     * 可申请上诉起始日
     */
    private String appealValidityStartDate;

    /**
     * 可申请上述截止日
     */
    private String appealValidityDueDate;
    /**
     * 可申请上述提醒日
     */
    private String appealValidityNoticeDate;
    /**
     * 诉讼时效起始日
     */
    private String actionValidityStartDate;

    /**
     * 诉讼时效到期日
     */
    private String actionValidityDueDate;

    /**
     * 诉讼时效提醒日
     */
    private String actionValidityNoticeDate;

    /**
     * 诉讼时效
     */
    private String actionLimitation;
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
