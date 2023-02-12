package com.eshopping.demo.service;

import com.eshopping.demo.model.Employee;

/**
 *
 * @author Ganesh
 */

public interface EmployeeService {

	public Employee saveEmployee(Employee employee);

	public Employee getEmployee(Integer id);

}
