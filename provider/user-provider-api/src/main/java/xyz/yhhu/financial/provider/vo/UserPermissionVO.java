package xyz.yhhu.financial.provider.vo;

import lombok.Data;

import java.util.List;

/**
 * @author Tiger
 * @date 2020-06-27
 * @see xyz.yhhu.financial.provider.vo
 **/
@Data
public class UserPermissionVO {
    /**
     * 主键
     */
    private Long id;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 角色名
     */
    private String roleName;

    /**
     * 权限列表
     */
    private List<String> permissionList;
}
