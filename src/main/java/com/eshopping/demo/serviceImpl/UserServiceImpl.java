package com.eshopping.demo.serviceImpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eshopping.demo.exception.EStoreException;
import com.eshopping.demo.model.FourDigitNumber;
import com.eshopping.demo.model.User;
import com.eshopping.demo.repository.FourDigitNumberRepository;
import com.eshopping.demo.repository.UserRepository;
import com.eshopping.demo.service.UserService;


/**
 *
 * @author Ganesh
 */
@Service
public class UserServiceImpl implements UserService {

	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private FourDigitNumberRepository fourDigitNumberRepository;

	@Override
	public User loginUser(String username, String password) {
		User user = userRepository.findByUsername(username);
		if (user == null) {
			throw new EStoreException("You entered incorrect username.");
		} else {
			if (user.getUsername().equals(username) && user.getUserpwd().equals(password)) {
				return user;
			}
			throw new EStoreException("You entered incorrect password.");
		}
	}

	@Override
	@Transactional
	public User saveUser(User user) {
		logger.info("User Service Implementation : saveUser() method");
		return userRepository.save(user);
	}

	@Override
	public List<User> getListByCity(String city) {
		List<User> user = userRepository.findByCity(city);
		logger.info("User Service Implementation : getListByCity() method");
		return user;
	}

	@Override
	public FourDigitNumber saveFourDigitNumber(FourDigitNumber fourDigitNumber) {
		logger.info("User Service Implementation : saveUser() method");
		return fourDigitNumberRepository.save(fourDigitNumber);
	}
}
