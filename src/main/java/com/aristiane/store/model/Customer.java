package com.aristiane.store.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "CUSTOMER")
public class Customer {

	@Id
	@Column(name = "CUSTOMER_ID")
	@GeneratedValue(strategy = GenerationType.AUTO) 
	Long id;
	
	@Column(name = "FIRST_NAME_CUSTOMER") 
	private String firstName;
	
	@Column(name = "LAST_NAME_CUSTOMER ")
	private String lastName;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "EMAIL_CUSTOMER")
	private String email;
	
	@Column(name = "DOCUMENT_CUSTOMER")
	private String document;
	
	@Column(name = "PHONE_CUSTOMER")
	private String phone;
	
	@Column(name = "ADDRESS_CUSTOMER")
	private String address;
	
	@Column(name = "DISTRICT_CUSTOMER")
	private String district;
	
	@Column(name = "CITY_CUSTOMER")
	private String city;
}
