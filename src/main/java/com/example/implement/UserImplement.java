package com.example.implement;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.domain.User;
import com.example.repository.UserRepository;

@Repository
public class UserImplement {
	@Autowired
	UserRepository userRepository;

	public void saveUser(User user) {
		user.setReg_date(new Date());
		userRepository.save(user);
	}
}
