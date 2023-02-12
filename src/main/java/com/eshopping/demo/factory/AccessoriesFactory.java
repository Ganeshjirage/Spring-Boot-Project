package com.eshopping.demo.factory;

import com.eshopping.demo.exception.EStoreException;
import com.eshopping.demo.service.AccessoriesService;

public class AccessoriesFactory {

	public static AccessoriesService getAccessoriesType(String type) {
		// camera, mobile, laptop
		if (type == null) {
			return null;
		} else if (type.equalsIgnoreCase("camera")) { // camera.equalsIgnoreCase("camera");
			return new Camera(); // return the object
		} else if (type.equalsIgnoreCase("mobile")) {
			return new Mobile();
		} else if (type.equalsIgnoreCase("laptop")) {
			return new Laptop();
		}
		throw new EStoreException("Invalid input"); // own exception or custom exception or user defined exception
	}
}
