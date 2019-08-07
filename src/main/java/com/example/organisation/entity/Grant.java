package com.example.organisation.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity@Table(name = "grant")
public class Grant {
@Id	
private int grantNumber;

private String grantAmount;
private String grantStartDate;
private String grantEndDate;
private String otherDetails;

public Grant() {}//default constructor

public int getGrantNumber() {
	return grantNumber;
}

public void setGrantNumber(int grantNumber) {
	this.grantNumber = grantNumber;
}

public String getGrantAmount() {
	return grantAmount;
}

public void setGrantAmount(String grantAmount) {
	this.grantAmount = grantAmount;
}

public String getGrantStartDate() {
	return grantStartDate;
}

public void setGrantStartDate(String grantStartDate) {
	this.grantStartDate = grantStartDate;
}

public String getGrantEndDate() {
	return grantEndDate;
}

public void setGrantEndDate(String grantEndDate) {
	this.grantEndDate = grantEndDate;
}

public String getOtherDetails() {
	return otherDetails;
}

public void setOtherDetails(String otherDetails) {
	this.otherDetails = otherDetails;
}

public Grant(int grantNumber, String grantAmount, String grantStartDate, String grantEndDate, String otherDetails) {
	super();
	this.grantNumber = grantNumber;
	this.grantAmount = grantAmount;
	this.grantStartDate = grantStartDate;
	this.grantEndDate = grantEndDate;
	this.otherDetails = otherDetails;
}
}
