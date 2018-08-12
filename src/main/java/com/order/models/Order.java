package com.order.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="orders")

public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int orderid;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "orderid")
	private List<OrderDetail> orderDetail =new ArrayList<>(0);	
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	

	
	public Order(int orderid, int quantity, List<OrderDetail> orderDetail) {
		super();
		this.orderid = orderid;
		
		this.orderDetail = orderDetail;
	}
	public List<OrderDetail> getOrderDetail() {
		return orderDetail;
	}
	public void setOrderDetail(List<OrderDetail> orderDetail) {
		this.orderDetail = orderDetail;
	}
	public Order() {
		super();
	}
	
	
}
