package com.learnSimple.service;

import com.learnSimple.entity.User;

public interface UserService {
	//adds user
public String registerUser(User user);

//checks whether user is present or not
public boolean checkEmail(String email);

//check if the password matches
public boolean valid(String email,String password);

//to get the value of type of user
public String getRole(String email);

}
