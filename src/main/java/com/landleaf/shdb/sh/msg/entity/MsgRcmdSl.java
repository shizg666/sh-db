package com.landleaf.shdb.sh.msg.entity;

import com.landleaf.shdb.common.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 推送场景联动信息
 * </p>
 *
 * @author lokiy
 * @since 2019-08-09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value="MsgRcmdSl对象", description="推送场景联动信息")
public class MsgRcmdSl extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "终端类型")
    private Integer terminalType;

    @ApiModelProperty(value = "推荐场景/联动名称")
    private String name;

    @ApiModelProperty(value = "场景/联动类型 1-全屋场景 2-区域场景 3-联动")
    private Integer type;

    @ApiModelProperty(value = "图片url")
    private String imgUrl;

    @ApiModelProperty(value = "发布人")
    private String releaseUser;

    @ApiModelProperty(value = "发布标识")
    private Integer releaseFlag;


}
