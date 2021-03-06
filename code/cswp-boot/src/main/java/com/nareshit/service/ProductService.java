package com.nareshit.service;

import java.util.Iterator;

import com.nareshit.domain.product;

public interface ProductService {

	public Iterator<product> getAllProducts();
	public product addProduct(product p);
	public product  getProductById(int id);
	product getProductByName(String name);
}
