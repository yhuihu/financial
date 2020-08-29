package xyz.yhhu.financial.business.service;

import com.google.common.collect.Lists;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import xyz.yhhu.financial.entity.MyUserDetail;
import xyz.yhhu.financial.provider.api.TbUserService;
import xyz.yhhu.financial.provider.vo.UserPermissionVO;

import java.util.List;

/**
 * @author Tiger
 * @date 2020-06-27
 * @see xyz.yhhu.financial.business.service
 **/
@Component
public class UserDetailsServiceImpl implements UserDetailsService {
    @Reference(version = "1.0.0")
    TbUserService tbUserService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        UserPermissionVO userPermissionVO = tbUserService.getByUserName(s);
        if (userPermissionVO != null) {
            List<GrantedAuthority> grantedAuthorities = Lists.newArrayList();
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(userPermissionVO.getRoleName());
            grantedAuthorities.add(grantedAuthority);
            return new MyUserDetail(userPermissionVO.getId(), userPermissionVO.getUserName(), userPermissionVO.getPassword(), grantedAuthorities);
        }
        return null;
    }
}
