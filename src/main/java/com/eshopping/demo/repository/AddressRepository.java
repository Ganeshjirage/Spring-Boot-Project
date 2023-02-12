package com.eshopping.demo.repository;

import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eshopping.demo.model.Address;


/**
 *
 * @author Ganesh
 */
@Repository
public interface AddressRepository extends CrudRepository<Address, Serializable> {

}
