package com.order.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.order.models.Order;
import com.order.services.OrderService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class OrderController {
	@Autowired
	private OrderService orderService;
	
	@RequestMapping(value="/order" ,method=RequestMethod.POST,produces = "application/json")
	public Order addOrder(@RequestBody Order o) {
		return orderService.saveOrder(o);
	}
	
	@RequestMapping(value="/getorders" ,method=RequestMethod.GET)
	public List<Order> getProducts() {
		
		
		return  orderService.getData();
		
		
	}
}
