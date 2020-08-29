package xyz.yhhu.financial.provider.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
    * 角色权限对应表
    */
@Data
@TableName(value = "tb_role_permission")
public class TbRolePermission {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    /**
     * 角色id
     */
    @TableField(value = "role_id")
    private Long roleId;

    /**
     * 权限id
     */
    @TableField(value = "permission_id")
    private Long permissionId;
}