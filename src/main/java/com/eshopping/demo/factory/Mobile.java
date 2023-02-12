package com.eshopping.demo.factory;

import com.eshopping.demo.service.AccessoriesService;

public class Mobile implements AccessoriesService {

	@Override
	public String getSpecificProduct() {
		return "mobile";
	}

}
