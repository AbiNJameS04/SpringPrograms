package com.ust.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ust.demo.Entity.MyUser;
import com.ust.demo.repository.UserRepository;

@Service
public class MyUserDetails implements UserDetailsService
{
	@Autowired
	private UserRepository ur;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<MyUser> temp = ur.findById(username);
		MyUser user=null;
		if(temp.isPresent())
		{
			user=temp.get();
		}
		return user;
	}

}