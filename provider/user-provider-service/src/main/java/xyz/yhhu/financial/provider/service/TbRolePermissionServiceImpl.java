package xyz.yhhu.financial.provider.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.dubbo.config.annotation.Service;
import xyz.yhhu.financial.provider.api.TbRolePermissionService;
import xyz.yhhu.financial.provider.domain.TbRolePermission;
import xyz.yhhu.financial.provider.mapper.TbRolePermissionMapper;
@Service
public class TbRolePermissionServiceImpl extends ServiceImpl<TbRolePermissionMapper, TbRolePermission> implements TbRolePermissionService{

}
