package com.landleaf.shdb.sh.scene.entity;

import com.landleaf.shdb.common.BaseEntity;
import java.time.LocalTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 定时场景配置
 * </p>
 *
 * @author lokiy
 * @since 2019-08-09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value="SceneTiming对象", description="定时场景配置")
public class SceneTiming extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "场景id")
    private Long sceneId;

    @ApiModelProperty(value = "场景名称")
    private String sceneName;

    @ApiModelProperty(value = "执行时间")
    private LocalTime executeTime;

    @ApiModelProperty(value = "周重复标识")
    private Integer weekRepeatFlag;

    @ApiModelProperty(value = "每周配置")
    private String weekdayType;

    @ApiModelProperty(value = "跳过节假日标识")
    private Integer holidaySkipFlag;

    @ApiModelProperty(value = "启用标识")
    private Integer enableFlag;


}
