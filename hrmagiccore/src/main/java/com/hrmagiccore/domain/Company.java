package com.hrmagiccore.domain;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@DiscriminatorColumn(name="CompanyType", discriminatorType=DiscriminatorType.STRING, length=20)
@DiscriminatorValue(value = "company")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) 
@Entity
public class Company {
	
	@Id
	private long companyId;
	private String name;
	private String contactPerson;
	private String contactNumb;
	//private Address address;
	
	
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
	/*public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}*/
}
