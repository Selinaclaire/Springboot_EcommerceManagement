package com.example.Ecommerceapp;

import jakarta.persistence.Entity;

@Entity
public class Product {
	
	@jakarta.persistence.Id
	private String productid;
	private String productname;
	private String description;
	private String quantity;
	private String price;
	private String type;
	
	public Product() {}
	
	public Product(String productid, String productname, String description, String quantity, String price,
			String type) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
		this.type = type;
	}
	public String getProductid() {
		return productid;
	}
	public void setProductid(String productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
