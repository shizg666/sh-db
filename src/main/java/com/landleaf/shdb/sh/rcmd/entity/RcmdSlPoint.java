package com.landleaf.shdb.sh.rcmd.entity;

import com.landleaf.shdb.common.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 推荐场景/联动点位表
 * </p>
 *
 * @author lokiy
 * @since 2019-08-09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value="RcmdSlPoint对象", description="推荐场景/联动点位表")
public class RcmdSlPoint extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "推荐场景/联动id")
    private Long rcmdSlConfigId;

    @ApiModelProperty(value = "产品点位id")
    private Long pointId;

    @ApiModelProperty(value = "产品点位名称")
    private String pointName;

    @ApiModelProperty(value = "比较和状态: 0-等于 1-大于 2大于等于 -1-小于 -2-小于等于")
    private Integer operator;

    @ApiModelProperty(value = "比较数值")
    private String val;


}
