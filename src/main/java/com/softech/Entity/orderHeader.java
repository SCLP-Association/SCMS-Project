package com.softech.Entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class orderHeader {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String userName;
	private String userMob;
	private String userEmail;
	private Long purchaseOrderNumber;
	
	@CreationTimestamp
	private LocalDate purchaseOrderDate;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="ordId")
	private orderItems orderItems;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="addressId")
	private address address;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserMob() {
		return userMob;
	}

	public void setUserMob(String userMob) {
		this.userMob = userMob;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Long getPurchaseOrderNumber() {
		return purchaseOrderNumber;
	}

	public void setPurchaseOrderNumber(Long purchaseOrderNumber) {
		this.purchaseOrderNumber = purchaseOrderNumber;
	}

	public LocalDate getPurchaseOrderDate() {
		return purchaseOrderDate;
	}

	public void setPurchaseOrderDate(LocalDate purchaseOrderDate) {
		this.purchaseOrderDate = purchaseOrderDate;
	}

	public orderItems getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(orderItems orderItems) {
		this.orderItems = orderItems;
	}

	public address getAddress() {
		return address;
	}

	public void setAddress(address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "orderHeader [id=" + id + ", userName=" + userName + ", userMob=" + userMob + ", userEmail=" + userEmail
				+ ", purchaseOrderNumber=" + purchaseOrderNumber + ", purchaseOrderDate=" + purchaseOrderDate
				+ ", orderItems=" + orderItems + ", address=" + address + "]";
	}

	public orderHeader(Long id, String userName, String userMob, String userEmail, Long purchaseOrderNumber,
			LocalDate purchaseOrderDate, com.softech.Entity.orderItems orderItems, com.softech.Entity.address address) {
		super();
		this.id = id;
		this.userName = userName;
		this.userMob = userMob;
		this.userEmail = userEmail;
		this.purchaseOrderNumber = purchaseOrderNumber;
		this.purchaseOrderDate = purchaseOrderDate;
		this.orderItems = orderItems;
		this.address = address;
	}

	public orderHeader() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
