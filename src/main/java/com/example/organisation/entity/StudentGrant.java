package com.example.organisation.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity@Table(name = "student_grant")
public class StudentGrant implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 2934045922903609312L;
@Id
private int studentId;
@Id
private int grantId;

private String dateFrom;
private String dateTo;
private String grantAmount;
private String otherDetails;
}
