package com.example.demo;

import org.springframework.stereotype.Service;

public class UserService {
	
	@Service
	public void save(User user) {
		System.out.println(user);
	}
}
