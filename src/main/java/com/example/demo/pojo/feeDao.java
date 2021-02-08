package com.example.demo.pojo;
import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel(value = "费用信息")
public class feeDao {

    /**
     * 主键ID
     */
    private String id;

    /**
     * 借据ID
     */
    private String iou_id;

    /**
     * 费用号
     */
    private String fee_id;

    /**
     * 受让前执行费用
     */
    private String pre_assignment_execution_fee;
    /**
     * 受让前诉讼费用
     */
    private String pre_assignment_Litigation_fee;
    /**
     * 受让前保全费用
     */
    private String pre_assignment_preservation_fee;

    /**
     * 受让前其它费用
     */
    private String pre_assignment_other_fee;

    /**
     * 受让后执行费用
     */
    private String post_assignment_execution_fee;

    /**
     * 受让后诉讼费用
     */
    private String post_assignment_Litigation_fee;
    /**
     * 受让后保全费用
     */
    private String post_assignment_preservation_fee;

    /**
     * 受让后其它费用
     */
    private String post_assignment_other_fee;

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
