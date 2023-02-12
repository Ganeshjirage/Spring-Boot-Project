package com.eshopping.demo.factory;

import com.eshopping.demo.service.AccessoriesService;

public class Camera implements AccessoriesService {

	@Override
	public String getSpecificProduct() {
		return "camera";
	}

}
