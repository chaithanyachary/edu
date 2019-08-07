package com.example.organisation.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity@Table(name = "student_class_enrollment")
public class StudentClassEnrollment implements Serializable
{
/**
	 * 
	 */
	private static final long serialVersionUID = 4467100183130659538L;
@Id
@JsonBackReference("stdue")
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "student_id")
private Student student;

@Id
@JsonBackReference("enrol")
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "class_id")
private Class classs;

private String dateFrom;
private String dateTo;
private String otherDetails;

public StudentClassEnrollment() {}

public Student getStudent() {
	return student;
}
public void setStudent(Student student) {
	this.student = student;
}
public Class getClasss() {
	return classs;
}
public void setClasss(Class classs) {
	this.classs = classs;
}
public String getDateFrom() {
	return dateFrom;
}
public void setDateFrom(String dateFrom) {
	this.dateFrom = dateFrom;
}
public String getDateTo() {
	return dateTo;
}
public void setDateTo(String dateTo) {
	this.dateTo = dateTo;
}
public String getOtherDetails() {
	return otherDetails;
}
public void setOtherDetails(String otherDetails) {
	this.otherDetails = otherDetails;
}
public StudentClassEnrollment(Student student, Class classs, String dateFrom, String dateTo, String otherDetails) {
	super();
	this.student = student;
	this.classs = classs;
	this.dateFrom = dateFrom;
	this.dateTo = dateTo;
	this.otherDetails = otherDetails;
}


}
