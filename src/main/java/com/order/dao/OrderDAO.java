package com.order.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.order.models.Order;

@Repository
public interface OrderDAO extends CrudRepository<Order, Integer>{

}
