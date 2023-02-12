package com.eshopping.demo.repository;

import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eshopping.demo.model.Employee;

/**
*
* @author Ganesh
*/
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Serializable>{
	public Employee findById(Integer Id);
}
