package xyz.yhhu.financial.provider.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 权限表
 * @author admin
 */
@Data
@TableName(value = "tb_permission")
public class TbPermission {
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 名称
     */
    @TableField(value = "permission_name")
    private String permissionName;

    /**
     * 授权路径
     */
    @TableField(value = "url")
    private String url;

    @TableField(value = "parent_id")
    private Long parentId;

    /**
     * 备注
     */
    @TableField(value = "description")
    private String description;

    @TableField(value = "create_time")
    private Date createTime;

    @TableField(value = "update_time")
    private Date updateTime;
}
