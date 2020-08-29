package xyz.yhhu.financial.provider.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import xyz.yhhu.financial.provider.domain.TbUser;
import xyz.yhhu.financial.provider.vo.UserPermissionVO;

public interface TbUserMapper extends BaseMapper<TbUser> {
    /**
     * 根据用户名查找权限
     * @param username 用户名
     * @return {@link UserPermissionVO}
     */
    UserPermissionVO selectPermissionByUserName(@Param("username") String username);
}
