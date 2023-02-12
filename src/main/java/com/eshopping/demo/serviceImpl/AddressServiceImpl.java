package com.eshopping.demo.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eshopping.demo.model.Address;
import com.eshopping.demo.repository.AddressRepository;
import com.eshopping.demo.service.AddressService;


/**
 *
 * @author Ganesh
 */
@Service
public class AddressServiceImpl implements AddressService {

	private static final Logger logger = LoggerFactory.getLogger(AddressServiceImpl.class);

	@Autowired
	private AddressRepository repo;

	@Override
	public Address saveAddress(Address address) {
		logger.info("Address Service Implementation : saveAddress() method");
		return repo.save(address);
	}
}
