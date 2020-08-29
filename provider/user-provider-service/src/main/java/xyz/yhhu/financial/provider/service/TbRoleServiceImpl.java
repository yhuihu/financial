package xyz.yhhu.financial.provider.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.dubbo.config.annotation.Service;
import xyz.yhhu.financial.provider.api.TbRoleService;
import xyz.yhhu.financial.provider.domain.TbRole;
import xyz.yhhu.financial.provider.mapper.TbRoleMapper;

@Service
public class TbRoleServiceImpl extends ServiceImpl<TbRoleMapper, TbRole> implements TbRoleService{

}
