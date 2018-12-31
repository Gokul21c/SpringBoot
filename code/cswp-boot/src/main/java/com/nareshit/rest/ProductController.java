package com.nareshit.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nareshit.domain.product;
import com.nareshit.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	@Autowired
	ProductService ps;
	
	@PostMapping(value="/addProduct")
	public product createProd(@RequestBody product p) {
		logger.info("product details are:\t"+p);
		return ps.addProduct(p);
	}
	
	@GetMapping(value="/byName/{name}",produces= {MediaType.APPLICATION_JSON_UTF8_VALUE})
	public product getProductByName(@PathVariable("name") String name) {
		logger.info("name is:\t:\t"+name);
		return ps.getProductByName(name);
	}
}
