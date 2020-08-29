package xyz.yhhu.financial.provider.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.dubbo.config.annotation.Service;
import xyz.yhhu.financial.provider.api.TbPermissionService;
import xyz.yhhu.financial.provider.domain.TbPermission;
import xyz.yhhu.financial.provider.mapper.TbPermissionMapper;

@Service
public class TbPermissionServiceImpl extends ServiceImpl<TbPermissionMapper, TbPermission> implements TbPermissionService{

}
