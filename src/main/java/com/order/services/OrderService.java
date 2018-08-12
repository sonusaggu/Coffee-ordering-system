package com.order.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.dao.OrderDAO;
import com.order.models.Order;
import com.order.models.Product;

@Service
public class OrderService {
	@Autowired
	private OrderDAO orderDao;
	
	public Order saveOrder(Order o) {
		return orderDao.save(o);
	}
	
	public List<Order> getData(){
		return (List<Order>) orderDao.findAll();
	}
	
}
