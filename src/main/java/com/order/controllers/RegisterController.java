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
import com.order.services.RegisterService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class RegisterController {

	@Autowired
	private RegisterService registerService;
	
	@RequestMapping(value="/register" ,method=RequestMethod.POST)
	public ResponseEntity registerUser(@RequestBody Register reg) {
		
		
		String res= registerService.registerUser(reg);
		
		if(res==null)
			return	ResponseEntity
		            .status(HttpStatus.FORBIDDEN)
		            .body("Error Message");
			else
				return ResponseEntity
			            .status(HttpStatus.ACCEPTED)
			            .body("Sucess");
	}
	@RequestMapping(value="/getUser",method=RequestMethod.GET)
	public String GetUSer() {
		return "saggu";
	}
	
	
	  @RequestMapping("/")
	    public String index() {
	   // String greetingsMessage = messageProperties.getGreetings();
	    //logger.info("Inside index() method, returning :"+greetingsMessage);
	    //return "Greetings from Spring Boot!";
	        return "Spring boot is up!!";
	    }
	
}
