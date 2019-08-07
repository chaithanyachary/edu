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

@Entity@Table(name = "class")
public class Class {
@Id
private int classId;

@JsonBackReference("stu-cla")
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "organisation_id")
private Organisation organisation;

private String classDetails;

public Class() {}

@JsonManagedReference("enrol")
@OneToMany(mappedBy = "classs", cascade = CascadeType.ALL)
private List<StudentClassEnrollment> classEnrollments;

public int getClassId() {
	return classId;
}

public void setClassId(int classId) {
	this.classId = classId;
}

public Organisation getOrganisation() {
	return organisation;
}

public void setOrganisation(Organisation organisation) {
	this.organisation = organisation;
}

public String getClassDetails() {
	return classDetails;
}

public void setClassDetails(String classDetails) {
	this.classDetails = classDetails;
}

public List<StudentClassEnrollment> getClassEnrollments() {
	return classEnrollments;
}

public void setClassEnrollments(List<StudentClassEnrollment> classEnrollments) {
	this.classEnrollments = classEnrollments;
}

public Class(int classId, Organisation organisation, String classDetails,
		List<StudentClassEnrollment> classEnrollments) {
	super();
	this.classId = classId;
	this.organisation = organisation;
	this.classDetails = classDetails;
	this.classEnrollments = classEnrollments;
}

}
