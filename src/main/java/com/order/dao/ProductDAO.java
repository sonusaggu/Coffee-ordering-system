package com.order.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.order.models.Product;

@Repository
public interface ProductDAO extends CrudRepository<Product, Integer>{

	
	
}
