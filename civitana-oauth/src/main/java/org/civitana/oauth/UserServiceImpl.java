package org.civitana.oauth;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@SuppressWarnings("deprecation")
public class UserServiceImpl implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
	    Collection<? extends GrantedAuthority> authorities = Arrays.asList(new GrantedAuthority[]{ new GrantedAuthorityImpl("ROLE_ADMIN") });
	    return  new User(username, username, true, true, true, true, authorities);
	}

}
