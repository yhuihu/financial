package xyz.yhhu.financial.provider.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author admin
 */
@Data
@TableName(value = "tb_user")
public class TbUser {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 用户名
     */
    @TableField(value = "user_name")
    private String userName;

    /**
     * 名称
     */
    @TableField(value = "nick_name")
    private String nickName;

    /**
     * 密码
     */
    @TableField(value = "password")
    private String password;

    /**
     * 头像
     */
    @TableField(value = "avatar")
    private String avatar;
}
