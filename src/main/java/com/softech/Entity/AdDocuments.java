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
public class AdDocuments {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Long id;
	
	private String userName;
	
	private Long purchaseOrderNumber;
	
	@CreationTimestamp
	private LocalDate documentsCreateDate;
	
	private String acknowledgementType;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ordId")
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

	public Long getPurchaseOrderNumber() {
		return purchaseOrderNumber;
	}

	public void setPurchaseOrderNumber(Long purchaseOrderNumber) {
		this.purchaseOrderNumber = purchaseOrderNumber;
	}

	public LocalDate getDocumentsCreateDate() {
		return documentsCreateDate;
	}

	public void setDocumentsCreateDate(LocalDate documentsCreateDate) {
		this.documentsCreateDate = documentsCreateDate;
	}

	public String getAcknowledgementType() {
		return acknowledgementType;
	}

	public void setAcknowledgementType(String acknowledgementType) {
		this.acknowledgementType = acknowledgementType;
	}

	public orderItems getOrdrItems() {
		return orderItems;
	}

	public void setOrdrItems(orderItems ordrItems) {
		this.orderItems = ordrItems;
	}

	@Override
	public String toString() {
		return "AdDocuments [id=" + id + ", userName=" + userName + ", purchaseOrderNumber=" + purchaseOrderNumber
				+ ", documentsCreateDate=" + documentsCreateDate + ", acknowledgementType=" + acknowledgementType
				+ ", ordrItems=" + orderItems + "]";
	}

	public AdDocuments(Long id, String userName, Long purchaseOrderNumber, LocalDate documentsCreateDate,
			String acknowledgementType, orderItems ordrItems) {
		super();
		this.id = id;
		this.userName = userName;
		this.purchaseOrderNumber = purchaseOrderNumber;
		this.documentsCreateDate = documentsCreateDate;
		this.acknowledgementType = acknowledgementType;
		this.orderItems = ordrItems;
	}

	public AdDocuments() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	
}
