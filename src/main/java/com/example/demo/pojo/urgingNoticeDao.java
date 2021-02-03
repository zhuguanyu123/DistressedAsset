package com.example.demo.pojo;
import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel(value = "受让前催收公告更新")
public class urgingNoticeDao {

    /**
     * 催收公告ID
     */
    private String urgingNoticeId;

    /**
     * 资产包ID
     */
    private String assetPackageId;

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
