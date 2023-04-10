package com.softech.Entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class RdDocuments {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String userName;
	
	private Long purcaseOrderNumber;
	
	@CreationTimestamp
	private LocalDate documntsCreteDate;
	
	private String acknowledgementType;
	
	@OneToOne(cascade = CascadeType.ALL)
	private orderItems orderItems;
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
	public Long getPurcaseOrderNumber() {
		return purcaseOrderNumber;
	}
	public void setPurcaseOrderNumber(Long purcaseOrderNumber) {
		this.purcaseOrderNumber = purcaseOrderNumber;
	}
	public LocalDate getDocumntsCreteDate() {
		return documntsCreteDate;
	}
	public void setDocumntsCreteDate(LocalDate documntsCreteDate) {
		this.documntsCreteDate = documntsCreteDate;
	}
	public String getAcknowledgementType() {
		return acknowledgementType;
	}
	public void setAcknowledgementType(String acknowledgementType) {
		this.acknowledgementType = acknowledgementType;
	}
	public orderItems getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(orderItems orderItems) {
		this.orderItems = orderItems;
	}
	@Override
	public String toString() {
		return "RdDocuments [id=" + id + ", userName=" + userName + ", purcaseOrderNumber=" + purcaseOrderNumber
				+ ", documntsCreteDate=" + documntsCreteDate + ", acknowledgementType=" + acknowledgementType
				+ ", orderItems=" + orderItems + "]";
	}
	public RdDocuments(Long id, String userName, Long purcaseOrderNumber, LocalDate documntsCreteDate,
			String acknowledgementType, com.softech.Entity.orderItems orderItems) {
		super();
		this.id = id;
		this.userName = userName;
		this.purcaseOrderNumber = purcaseOrderNumber;
		this.documntsCreteDate = documntsCreteDate;
		this.acknowledgementType = acknowledgementType;
		this.orderItems = orderItems;
	}
	public RdDocuments() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
