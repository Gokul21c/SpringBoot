package com.nareshit.service;

import java.util.Iterator;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.nareshit.dao.ProductDao;
import com.nareshit.domain.product;
import com.nareshit.repository.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

	private static final Logger logger = Logger.getLogger(ProductServiceImpl.class);
	
	@Autowired
	private ProductRepo repo;
	
	@Autowired
	private ProductDao dao;
	
	@Transactional(isolation=Isolation.SERIALIZABLE,timeout=6000,rollbackFor=Exception.class)
	@Override
	public Iterator<product> getAllProducts() {
	
		logger.info("i am in product service get all products");
		return dao.getAllProducts();
	}

	@Transactional(isolation=Isolation.SERIALIZABLE,timeout=6000,rollbackFor=Exception.class)
	@Override
	public product addProduct(product p) {
		logger.info("i am in product service get all products:\t"+p);
		return dao.addProduct(p);
	}

	@Transactional(isolation=Isolation.SERIALIZABLE,timeout=6000,rollbackFor=Exception.class)
	@Override
	public product getProductById(int id) {
		// TODO Auto-generated method stub
		//return repo.findOne(id);
		return dao.getProductById(id);
	}
	
	@Transactional(isolation=Isolation.SERIALIZABLE,timeout=6000,rollbackFor=Exception.class)
	@Override
	public product getProductByName(String name) {
		//return repo.getProductByName(name).get(0);
		return dao.getProductByName(name);
	}

}
