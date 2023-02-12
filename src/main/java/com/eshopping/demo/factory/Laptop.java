package com.eshopping.demo.factory;

import com.eshopping.demo.service.AccessoriesService;

public class Laptop implements AccessoriesService {

	@Override
	public String getSpecificProduct() {
		return "laptop";
	}

	
}
