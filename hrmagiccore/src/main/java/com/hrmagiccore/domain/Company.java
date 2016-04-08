package com.hrmagiccore.domain;

public class Company {
	
	private String name;
	private String contactPerson;
	private String contactNumb;
	private Address address;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public String getContactNumb() {
		return contactNumb;
	}
	public void setContactNumb(String contactNumb) {
		this.contactNumb = contactNumb;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	

}
