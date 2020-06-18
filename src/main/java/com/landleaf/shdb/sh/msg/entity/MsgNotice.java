package com.landleaf.shdb.sh.msg.entity;

import com.landleaf.shdb.common.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 公告消息表
 * </p>
 *
 * @author lokiy
 * @since 2019-08-09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value="MsgNotice对象", description="公告消息表")
public class MsgNotice extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "终端类型 0-所有 1-app 2-大屏")
    private Integer terminalType;

    @ApiModelProperty(value = "公告标题")
    private String title;

    @ApiModelProperty(value = "公共内容")
    private String content;

    @ApiModelProperty(value = "发布人")
    private String releaseUser;

    @ApiModelProperty(value = "发布标识 0-未发布 1-已发布")
    private Integer releaseFlag;


}
