package com.example.demo.pojo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel(value = "抵押物信息")
public class collateralDao {


    /**
     * 抵押物ID
     */
    private String collateralId;

    /**
     * 担保ID
     */
    private String guaranteeId;

    /**
     * 抵押物名称
     */
    private String collateralName;

    /**
     * 抵押物位置
     */
    private String collateralLocation;
    /**
     * 土地面积
     */
    private String landArea;
    /**
     * 房产面积
     */
    private String propertySize;

    /**
     * 评估价
     */
    private String appraisedValue;

    /**
     * 登记金额
     */
    private String registrationAmount;

    /**
     * 以物抵债ID
     */
    private String debtInKindId;

    /**
     * 资产性质
     */
    private String natureAsset;

    /**
     * 案件进度
     */
    private String caseAdvancing;

    /**
     * 现产权人
     */
    private String currentOwner;

    /**
     * 移交部门
     */
    private String transferringDepartment;

    /**
     * 移交时间
     */
    private String handoverTime;

    /**
     * 执行裁定结果
     */
    private String rulingResult;

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
