package com.learnSimple.service;

import org.springframework.stereotype.Service;

import com.learnSimple.entity.User;
import com.learnSimple.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService{
	UserRepository userRepo;
	
	public UserServiceImplementation(UserRepository userRepo) {
		super();
		this.userRepo = userRepo;
	}


	public String registerUser(User user) {
		userRepo.save(user);
		return "User Added Successfully";
	}


	@Override
	public boolean checkEmail(String email) {
		return userRepo.existsByEmail(email);
	}


	@Override
	public boolean valid(String email, String password) {
		User u=userRepo.findByEmail(email);
		String dbpass=u.getPassword();
		return password.equals(dbpass);
		
	}
	
	@Override
	public String getRole(String email) {
		User u=userRepo.findByEmail(email);
		String role=u.getRole();
		return role;
	}






	


}
