package com.softura.healthcareapi.services;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


import com.softura.healthcareapi.models.Role;
import com.softura.healthcareapi.models.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;






@Service
public class UserAuthService implements UserDetailsService {


	@Autowired
	private UserAccountService userService;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserAccount user = userService.getUserByName(username);
		if (user == null) {
			throw new UsernameNotFoundException("User '" + username + "' not found.");
		}
		List<Role> roles = userService.getRoles(username);
		List<GrantedAuthority> grantedAuthorities = roles.stream().map(r -> {
			return new SimpleGrantedAuthority(r.getRoleName());
		}).collect(Collectors.toList());
		return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(),
				grantedAuthorities);
	}

	public UserAccount getUserByUsername(String username) {
		UserAccount user= userService.getUserByName(username);

		if (user != null) {

			return user;
		}

		return null;
	}

	
}
