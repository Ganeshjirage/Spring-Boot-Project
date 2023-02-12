package com.eshopping.demo.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eshopping.demo.model.FourDigitNumber;


@Repository
public interface FourDigitNumberRepository extends CrudRepository<FourDigitNumber, Serializable> {

}
