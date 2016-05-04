package com.hrmagiccore.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long empID;
	private String name;

	// TODO Check with Tasneem what for we use this.
	private boolean eVerified;

	// TODO Check with Tasneem what for we use this- Is it a Date
	private Date visaValidation; // start date to end date

	private Date startDate;
	private Date lcaExpiration;
	private double lcaSalary;
	

	private boolean i9onFile;

	// TODO Check with Tasneem what for we use this.
	private boolean paf;

	// TODO Check with Tasneem what for we use this.
	private boolean w4onFile;
	private String ssn;
	private Date dob;
	private int contact;
	private String email;
	
	
	
	@OneToOne(cascade=CascadeType.ALL)
	private HomeAddress homeAddress;
	
	@OneToOne(cascade=CascadeType.ALL)
	private WorkAddress workAddress;
	private String workPhone;
	
	@OneToOne(cascade=CascadeType.ALL)
	private EndClient endClient;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Vendor vendor;
	@Enumerated(EnumType.STRING)
	private VisaStatus visaStatus;
	
	public long getEmpID() {
		return empID;
	}

	public void setEmpID(long empID) {
		this.empID = empID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean iseVerified() {
		return eVerified;
	}

	public void seteVerified(boolean eVerified) {
		this.eVerified = eVerified;
	}

	public VisaStatus getVisaStaus() {
		return visaStatus;
	}

	public void setVisaStaus(VisaStatus visaStatus) {
		this.visaStatus = visaStatus;
	}

	public Date getVisaValidation() {
		return visaValidation;
	}

	public void setVisaValidation(Date visaValidation) {
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

	public boolean isW4onFile() {
		return w4onFile;
	}

	public void setW4onFile(boolean w4onFile) {
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

	public void setHomeAddress(HomeAddress homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(WorkAddress workAddress) {
		this.workAddress = workAddress;
	}

	public String getWorkPhone() {
		return workPhone;
	}

	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}

	
	  public EndClient getEndClient() {
	 
		return endClient;
	}

	public void setEndClient(EndClient endClient) {
		this.endClient = endClient;
	}

	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	@Override
	public String toString() {
		return "Employee [empID= " + empID + ",name=" + name + ", eVerified=" + eVerified + ",visaStatus= " +
	visaStatus+
				 ",visaValidation=" + visaValidation + ",startDate=" + startDate + ",lcaExpiration=" + lcaExpiration
				+ ",lcaSalary=" + lcaSalary + ",i9onFile=" + i9onFile + ",paf=" + paf + ",w4onFile=" + w4onFile
				+ ",ssn=" + ssn + ",dob=" + dob + ",contact=" + contact + ",email=" + email + ",homeAddress="
			//+ homeAddress + ",workAddress=" + workAddress + ",workPhone=" + workAddress 
				+ ",endClient=" + endClient + ",vendor=" + vendor 
				+ "]";

	}

}
