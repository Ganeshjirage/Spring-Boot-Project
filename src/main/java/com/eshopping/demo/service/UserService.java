package com.eshopping.demo.service;

import java.util.List;

import com.eshopping.demo.model.FourDigitNumber;
import com.eshopping.demo.model.User;

/**
 *
 * @author Ganesh
 */

public interface UserService {

	public User loginUser(String username, String password) throws Exception;

	public User saveUser(User user);

	public List<User> getListByCity(String city);
	
	public FourDigitNumber saveFourDigitNumber(FourDigitNumber fourDigitNumber);

}
