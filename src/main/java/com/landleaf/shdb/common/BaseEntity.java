package com.landleaf.shdb.common;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.util.Date;

/**
 * @author Lokiy
 * @date 2019/8/5 16:45
 * @description:
 */
@Data
public class BaseEntity extends Model<BaseEntity> {

    private Long id;

    private Integer delFlag;

    private Date createTime;

    private String createUser;

    private Date updateTime;

    private String updateUser;
}
