package com.softech.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class address {
     
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long addressId;
	
	private String address1;
	
	private String address2;
	
	private String city;
	
	private String state;
	
	private String postalcode;
	
	public Long getId() {
		return addressId;
	}
	public void setId(Long id) {
		this.addressId = id;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPostalode() {
		return postalcode;
	}
	public void setPostalode(String postalode) {
		this.postalcode = postalode;
	}
	@Override
	public String toString() {
		return "address [id=" + addressId + ", address1=" + address1 + ", address2=" + address2 + ", city=" + city + ", state="
				+ state + ", postalode=" + postalcode + "]";
	}
	public address(Long id, String address1, String address2, String city, String state, String postalode) {
		super();
		this.addressId = id;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.postalcode = postalode;
	}
	public address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
