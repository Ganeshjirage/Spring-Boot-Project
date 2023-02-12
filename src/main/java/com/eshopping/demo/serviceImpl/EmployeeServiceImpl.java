package com.eshopping.demo.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eshopping.demo.model.Employee;
import com.eshopping.demo.repository.EmployeeRepository;
import com.eshopping.demo.service.EmployeeService;

/**
 *
 * @author Ganesh
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);

	@Autowired
	private EmployeeRepository repo;

	@Override
	public Employee saveEmployee(Employee employee) {
		logger.info("Employee Service Implementation : saveEmployee() method");
		return repo.save(employee);
	}

	@Override
	public Employee getEmployee(Integer id) {
		return repo.findById(id);
	}
}
