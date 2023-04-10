package com.softech.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class orderItems {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ordId;
	private Long productNumber;
	private String productName;
	private int productQty;
	private Long productPrice;
	public Long getId() {
		return ordId;
	}
	public void setId(Long id) {
		this.ordId = id;
	}
	public Long getProductNumber() {
		return productNumber;
	}
	public void setProductNumber(Long productNumber) {
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductQty() {
		return productQty;
	}
	public void setProductQty(int productQty) {
		this.productQty = productQty;
	}
	public Long getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Long productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "orderItems [id=" + ordId + ", productNumber=" + productNumber + ", productName=" + productName
				+ ", productQty=" + productQty + ", productPrice=" + productPrice + "]";
	}
	public orderItems(Long id, Long productNumber, String productName, int productQty, Long productPrice) {
		super();
		this.ordId = id;
		this.productNumber = productNumber;
		this.productName = productName;
		this.productQty = productQty;
		this.productPrice = productPrice;
	}
	public orderItems() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
