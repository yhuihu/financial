package xyz.yhhu.financial.provider.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.dubbo.config.annotation.Service;
import xyz.yhhu.financial.provider.api.TbUserRoleService;
import xyz.yhhu.financial.provider.domain.TbUserRole;
import xyz.yhhu.financial.provider.mapper.TbUserRoleMapper;

@Service
public class TbUserRoleServiceImpl extends ServiceImpl<TbUserRoleMapper, TbUserRole> implements TbUserRoleService{

}
