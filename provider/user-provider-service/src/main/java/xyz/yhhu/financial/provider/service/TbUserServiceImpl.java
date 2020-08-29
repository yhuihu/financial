package xyz.yhhu.financial.provider.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import xyz.yhhu.financial.provider.api.TbUserService;
import xyz.yhhu.financial.provider.domain.TbUser;
import xyz.yhhu.financial.provider.mapper.TbUserMapper;
import xyz.yhhu.financial.provider.vo.UserPermissionVO;

/**
 * @author admin
 */
@Service
public class TbUserServiceImpl extends ServiceImpl<TbUserMapper, TbUser> implements TbUserService {

    @Autowired
    TbUserMapper tbUserMapper;

    @Override
    public UserPermissionVO getByUserName(String username) {
        return null;
    }
}
