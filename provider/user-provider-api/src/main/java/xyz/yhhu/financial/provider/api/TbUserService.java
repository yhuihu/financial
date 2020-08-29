package xyz.yhhu.financial.provider.api;

import xyz.yhhu.financial.provider.domain.TbUser;
import com.baomidou.mybatisplus.extension.service.IService;
import xyz.yhhu.financial.provider.vo.UserPermissionVO;

/**
 * @author admin
 */
public interface TbUserService extends IService<TbUser>{
    /**
     * 根据用户名查找用户
     * @param username 用户名
     * @return {@link UserPermissionVO}
     */
    UserPermissionVO getByUserName(String username);
}
