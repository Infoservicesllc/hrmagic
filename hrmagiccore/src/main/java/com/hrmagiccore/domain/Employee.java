package com.hrmagiccore.domain;

import java.util.Date;

public class Employee {
	
	private int empID;
	private String name;
	
	//TODO Check with Tasneem what for we use this.
	private String eVerified;
	
	//TODO Check with Tasneem what for we use this.
	private String visaStatus;
	//TODO Check with Tasneem what for we use this. Is it a Date 
	private String visaValidation;
	private Date startDate;
	private Date lcaExpiration;
	private double lcaSalary;
	private boolean i9onFile;
	
	//TODO Check with Tasneem what for we use this.
	private boolean paf;
	
	//TODO Check with Tasneem what for we use this.
	private String w4onFile;
	private String ssn;
	private Date dob;
	private int contact;
	private String email;	
	private Address homeAddress;	
	private Address workAddress;
	private String workPhone;
	private Company endClient;
	private Company vendor;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String geteVerified() {
		return eVerified;
	}
	public void seteVerified(String eVerified) {
		this.eVerified = eVerified;
	}
	public String getVisaStatus() {
		return visaStatus;
	}
	public void setVisaStatus(String visaStatus) {
		this.visaStatus = visaStatus;
	}
	public String getVisaValidation() {
		return visaValidation;
	}
	public void setVisaValidation(String visaValidation) {
		this.visaValidation = visaValidation;
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
	public String getW4onFile() {
		return w4onFile;
	}
	public void setW4onFile(String w4onFile) {
		this.w4onFile = w4onFile;
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
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Address getWorkAddress() {
		return workAddress;
	}
	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}
	public String getWorkPhone() {
		return workPhone;
	}
	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}
	public Company getEndClient() {
		return endClient;
	}
	public void setEndClient(Company endClient) {
		this.endClient = endClient;
	}
	public Company getVendor() {
		return vendor;
	}
	public void setVendor(Company vendor) {
		this.vendor = vendor;
	}
}
