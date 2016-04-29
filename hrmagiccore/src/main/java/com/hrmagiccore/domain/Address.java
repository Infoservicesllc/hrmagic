package com.hrmagiccore.domain;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.springframework.stereotype.Component;


@DiscriminatorColumn(name="AddressType", discriminatorType=DiscriminatorType.STRING, length=20)
@DiscriminatorValue(value = "address")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) 
@Entity
@Component
public class Address {
	
	@Id
	private long addressId;
	private String line1;
	private	String line2;
	private	String city;
	private	String state;
	private	String zip;
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
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
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
}
