package com.landleaf.shdb.sh.msg.entity;

import com.landleaf.shdb.common.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 广告消息表
 * </p>
 *
 * @author lokiy
 * @since 2019-08-09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value="MsgAdvert对象", description="广告消息表")
public class MsgAdvert extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "终端类型")
    private Integer terminalType;

    @ApiModelProperty(value = "广告标题")
    private String title;

    @ApiModelProperty(value = "广告摘要")
    private String digest;

    @ApiModelProperty(value = "广告图片url")
    private String imgUrl;

    @ApiModelProperty(value = "富文本url")
    private String richTextUrl;

    @ApiModelProperty(value = "发布人")
    private String releaseUser;

    @ApiModelProperty(value = "发布标识")
    private Integer releaseFlag;


}
