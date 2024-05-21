package com.shopeefy.service;

import java.util.List;

import com.shopeefy.exception.UserException;
import com.shopeefy.modal.User;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public List<User> findAllUsers();

}
