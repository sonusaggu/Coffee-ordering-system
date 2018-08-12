package com.order.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.order.models.Register;
import com.order.services.ProductService;
import com.order.services.RegisterService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class LoginController {
	@Autowired
	private ProductService productService;
	@Autowired
	private RegisterService registerService;
	
	@RequestMapping(value="/login" ,method=RequestMethod.POST,produces = "application/json")
	public ResponseEntity registerUser(@RequestBody Register reg) {
		String res=registerService.findUser(reg);
		if(res==null)
		return	ResponseEntity
	            .status(HttpStatus.FORBIDDEN)
	            .body("Error Message");
		else {
			
			productService.defaultData();
			return ResponseEntity
		            .status(HttpStatus.ACCEPTED)
		            .body("Sucess");}
	}

}
