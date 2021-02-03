package com.example.demo.pojo;
import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel(value = "受让后催后公告")
public class laterUrgingNoticeDao {


    /**
     * 受让后催收公告ID
     */
    private String laterUrgingNoticeId;

    /**
     * 借据号
     */
    private String iouId;

    /**
     * 催收公告日
     */
    private String urgingNoticeDate;

    /**
     * 催告方式
     */
    private String urgingType;

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
