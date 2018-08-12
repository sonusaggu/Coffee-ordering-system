package com.order.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.order.models.Product;
import com.order.services.ProductService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ProductController {

	@Autowired
	ProductService productService;
	
	@RequestMapping(value="/product" ,method=RequestMethod.POST)
	public ResponseEntity registerUser(@RequestBody Product prod) {
		
		
		String res= productService.addProduct(prod);
		
		if(res==null)
			return	ResponseEntity
		            .status(HttpStatus.FORBIDDEN)
		            .body("Error Message");
			else
				return ResponseEntity
			            .status(HttpStatus.ACCEPTED)
			            .body("Sucess");
	}
	
	
	@RequestMapping(value="/getproduct" ,method=RequestMethod.GET)
	public List<Product> getProducts() {
		
		
		return  productService.getData();
		
		
	}
}
