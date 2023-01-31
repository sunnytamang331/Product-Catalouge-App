package com.nagarro.service;

import com.nagarro.entities.User;
import com.nagarro.payload.LoginDTO;
import com.nagarro.payload.SignUpDTO;

// TODO: Auto-generated Javadoc
/**
 * The Interface UserService.
 */
public interface UserService {

	/**
	 * Adds the user service.
	 *
	 * @param signUpDTO the sign up DTO
	 * @return the user
	 */
	User addUserService(SignUpDTO signUpDTO);
	
	/**
	 * Authenticate user service.
	 *
	 * @param loginDTO the login DTO
	 * @return the user
	 */
	User authenticateUserService(LoginDTO loginDTO);
}
