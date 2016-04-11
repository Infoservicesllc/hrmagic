package com.hrmagiccore.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Employee {
	@Id
	private int empID;
	private String name;
	
	//TODO Check with Tasneem what for we use this.
	private boolean eVerified;
	
	//TODO Check with Tasneem what for we use this.
	public enum visaStatus{
		OPT,H1,H4EAD,GC,USC
	};
	//TODO Check with Tasneem what for we use this. Is it a Date 
	private Date visaValidation; // start date to end date
	private Date startDate;
	private Date lcaExpiration;
	private double lcaSalary;
	private boolean i9onFile;
	
	//TODO Check with Tasneem what for we use this.
	private boolean paf;
	
	//TODO Check with Tasneem what for we use this.
	private boolean w4onFile;
	private String ssn;
	private Date dob;
	private int contact;
	private String email;	
	@ManyToOne
	private Address homeAddress;
	@ManyToOne
	private Address workAddress;
	private String workPhone;
	@ManyToOne
	private Company endClient;
	@ManyToOne
	private Company vendor;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getLcaExpiration() {
		return lcaExpiration;
	}
	public void setLcaExpiration(Date lcaExpiration) {
		this.lcaExpiration = lcaExpiration;
	}
	public double getLcaSalary() {
		return lcaSalary;
	}
	public void setLcaSalary(double lcaSalary) {
		this.lcaSalary = lcaSalary;
	}
	public boolean isI9onFile() {
		return i9onFile;
	}
	public void setI9onFile(boolean i9onFile) {
		this.i9onFile = i9onFile;
	}
	public boolean isPaf() {
		return paf;
	}
	public void setPaf(boolean paf) {
		this.paf = paf;
	}
	
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getWorkPhone() {
		return workPhone;
	}
	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}
	
}
