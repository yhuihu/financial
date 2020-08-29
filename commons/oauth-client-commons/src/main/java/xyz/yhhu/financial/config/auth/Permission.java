package xyz.yhhu.financial.config.auth;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;

/**
 * @author Tiger
 * @date 2020-06-27
 * @see xyz.yhhu.financial.config.auth
 **/
@Component("permission")
public class Permission {
    private AntPathMatcher antPathMatcher = new AntPathMatcher();

    public boolean hasPermission(HttpServletRequest request, Authentication authentication) {
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        for (GrantedAuthority authority : authorities) {
            if (antPathMatcher.match(authority.getAuthority(), request.getRequestURI())) {
                return true;
            }
        }
        return false;
    }
}
