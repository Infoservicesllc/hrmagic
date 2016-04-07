package com.hrmagiccore;

import java.util.Date;

public class Employee {
	
	String employeeName;
	String eVerified;
	String visaStatus;
	String visaValidation;
	Date startDate;
	Date lcaExpiration;
	float lcaSalary;
	boolean i9onFile;
	boolean paf;
	String w4onFile;
	String ssn;
	Date dob;
	int contactNum;
	String email;
	HomeAddress homeAddress;
	String endClient;
	WorkAddress workAddress;
	int workPhone;
	String vendor;
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
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
	public float getLcaSalary() {
		return lcaSalary;
	}
	public void setLcaSalary(float lcaSalary) {
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
	public int getContactNum() {
		return contactNum;
	}
	public void setContactNum(int contactNum) {
		this.contactNum = contactNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public HomeAddress getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(HomeAddress homeAddress) {
		this.homeAddress = homeAddress;
	}
	public String getEndClient() {
		return endClient;
	}
	public void setEndClient(String endClient) {
		this.endClient = endClient;
	}
	public WorkAddress getWorkAddress() {
		return workAddress;
	}
	public void setWorkAddress(WorkAddress workAddress) {
		this.workAddress = workAddress;
	}
	public int getWorkPhone() {
		return workPhone;
	}
	public void setWorkPhone(int workPhone) {
		this.workPhone = workPhone;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

}
