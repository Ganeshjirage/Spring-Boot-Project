package com.eshopping.demo.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eshopping.demo.exception.EStoreException;
import com.eshopping.demo.model.Product;
import com.eshopping.demo.repository.ProductRepository;
import com.eshopping.demo.service.ProductService;

/**
 *
 * @author Ganesh
 */
@Service
public class ProductServiceImpl implements ProductService {

	private static final Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);

	@Autowired
	private ProductRepository repo; // injecting repo object into productserviceimpl class

	@Override
	public Iterable<Product> getAllProduct() {
		logger.info("Product Service Implementation : getAllProduct() method");
		return repo.findAll(); // to get the all list
	}

	@Override
	@Transactional
	public Product saveProduct(Product product) {
		logger.info("Product Service Implementation : saveProduct() method");
		return repo.save(product); // repo---db --//press f8 --back to api
	}

	@Override
	public Product getProductById(Integer Id) {
		logger.info("Product Service Implementation : getProductById() method");
		Product product = repo.findById(Id);// null
		if (product == null) { // null==null, 4==null-
			throw new EStoreException("Product id " + Id + " incorrect.."); // calling the constructor
		}
		return product;
	}

	@Override
	public void deleteProduct(Integer id) {
		logger.info("Product Service Implementation : deleteProduct() method");
		repo.deleteById(id);
	}

}
