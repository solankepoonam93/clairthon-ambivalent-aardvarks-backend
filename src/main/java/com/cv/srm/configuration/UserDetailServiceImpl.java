package com.cv.srm.configuration;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cv.srm.model.Role;
import com.cv.srm.model.User;
import com.cv.srm.repository.UserRepository;
import com.cv.srm.util.AppUtils;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String userData) throws UsernameNotFoundException {
		User appUser = userRepository.findByEmail(userData);
		
		Set<Role> userRoles = appUser.getRoles();
		if(AppUtils.isBlankOrNullCol(userRoles)) {
			userRoles = new HashSet<>();
		}
		return org.springframework.security.core.userdetails.User
			        .withUsername(userData)//
			        .password(appUser.getPassword())//
			        .authorities(userRoles.stream().map(role -> new SimpleGrantedAuthority(role.getName()))
							.filter(Objects::nonNull).collect(Collectors.toList()))// .authorities(user.getRoles()) Hardcore User Role
			        //.disabled(appUser.isAccountDisabled())//
			        .build();
		
	}

}
