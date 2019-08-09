package com.landleaf.shdb.sh.rcmd.entity;

import com.landleaf.shdb.common.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 场景/联动配置表
 * </p>
 *
 * @author lokiy
 * @since 2019-08-09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value="RcmdSlConfig对象", description="场景/联动配置表")
public class RcmdSlConfig extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "推荐场景/联动id")
    private Long rcmdSlId;

    @ApiModelProperty(value = "推荐场景/联动所绑定的产品id")
    private Long productId;

    @ApiModelProperty(value = "1-场景 2-联动 9-动作")
    private Integer type;


}
