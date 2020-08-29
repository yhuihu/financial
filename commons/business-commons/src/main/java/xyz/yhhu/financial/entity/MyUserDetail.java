package xyz.yhhu.financial.entity;

import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

/**
 * @author Tiger
 * @date 2020-06-27
 * @see xyz.yhhu.financial.entity
 **/
public class MyUserDetail extends User {
    @Getter
    private final Long id;

    public MyUserDetail(Long id,String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, true, true, true, true, authorities);
        this.id = id;
    }
}
