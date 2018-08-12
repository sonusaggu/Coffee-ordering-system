package com.order.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.dao.ProductDAO;
import com.order.models.Product;
@Service
public class ProductService {
	@Autowired
	ProductDAO productDao;
	public String addProduct(Product prod) {
		
		productDao.save(prod);
		return "Success";
	}
	
	public void defaultData() {
		
		
		List<Product> l=new ArrayList<>();
		l.add(new Product(1,"Latte",34));
		l.add(new Product(2,"Cappuccino",134));
		productDao.saveAll(l);
		
	}
	
	public List<Product> getData(){
		return (List<Product>) productDao.findAll();
	}
	
}
