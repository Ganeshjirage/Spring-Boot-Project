package com.eshopping.demo.repository;

import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eshopping.demo.model.Product;

/**
*
* @author Ganesh-DAO Layer
*/
@Repository
public interface ProductRepository extends CrudRepository<Product, Serializable>{
	
	public Product findById(Integer Id);

}
