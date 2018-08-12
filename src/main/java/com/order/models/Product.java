package com.order.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Id")
	private int productId;
	public Product(int productId, String productName, int productPrice) {
		super();
		this.productId = productId;
		this.productname = productName;
		this.productprice = productPrice;
	}
	
	public String getProductname() {
		return productname;
	}


	public void setProductname(String productname) {
		this.productname = productname;
	}


	public int getProductprice() {
		return productprice;
	}


	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}

	@Column(name="productname")
	private String productname;
	@Column(name="productprice")
	private int productprice;


	public Product() {
		super();
	}
	

}
