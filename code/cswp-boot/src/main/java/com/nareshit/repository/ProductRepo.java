package com.nareshit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nareshit.domain.product;

public interface ProductRepo extends JpaRepository<product, Integer> {

	@Query("from product p where p.name=:name")
	public List<product> getProductByName(@Param("name")String name);
}
