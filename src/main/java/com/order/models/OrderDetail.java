package com.order.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="OrderDetail")
public class OrderDetail {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int oid;
	@Column(name="productname")
	private String productname;
	@Column(name="quantity")
	private String quantity;
	public OrderDetail(int oid, String productname, String quantity, int productprice) {
		super();
		this.oid = oid;
		this.productname = productname;
		this.quantity = quantity;
		this.productprice = productprice;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	@Column(name="productprice")
	private int productprice;
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
	
	public OrderDetail() {
		super();
	}
	
}
