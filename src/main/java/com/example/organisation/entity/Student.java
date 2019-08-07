package com.example.organisation.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity@Table(name = "student")
public class Student {
@Id	
private int studentId;

@JsonBackReference("stu-org")
@ManyToOne(fetch = FetchType.EAGER)
@JoinColumn(name = "employer_organisation_id")
private Organisation organisation;

private String studentDetails;

@JsonManagedReference("stdue")
@OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
private List<StudentClassEnrollment> classEnrollments;

public int getStudentId() {
	return studentId;
}

public void setStudentId(int studentId) {
	this.studentId = studentId;
}

public Organisation getOrganisation() {
	return organisation;
}

public void setOrganisation(Organisation organisation) {
	this.organisation = organisation;
}

public String getStudentDetails() {
	return studentDetails;
}

public void setStudentDetails(String studentDetails) {
	this.studentDetails = studentDetails;
}

public Student(int studentId, Organisation organisation, String studentDetails) {
	super();
	this.studentId = studentId;
	this.organisation = organisation;
	this.studentDetails = studentDetails;
}

@Override
public String toString() {
	return "Student [studentId=" + studentId + ", organisation=" + organisation + ", studentDetails=" + studentDetails
			+ "]";
}

public Student() {}

}
