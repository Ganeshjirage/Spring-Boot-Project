package com.eshopping.demo.service;

import com.eshopping.demo.model.Product;

/**
 *
 * @author Ganesh
 */
public interface ProductService {

	// List<Product> or Iterable<Product>-CRUD Operation
	public Iterable<Product> getAllProduct();

	public Product saveProduct(Product product);

	public <optional> Product getProductById(Integer Id);

	public void deleteProduct(Integer id);

}
