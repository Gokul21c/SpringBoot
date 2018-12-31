package com.nareshit.dao;

import java.util.Iterator;

import com.nareshit.domain.product;

public interface ProductDao {

	public Iterator<product> getAllProducts();
	public product addProduct(product p);
	public product  getProductById(int id);
	product getProductByName(String name);
}
