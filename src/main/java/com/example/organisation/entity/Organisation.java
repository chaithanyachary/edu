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

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity@Table(name = "organisation")
public class Organisation 
{
@Id
private int organisationId;

@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
@JoinColumn(name = "organisation_type")
private OrganisationType organisationType;

private String organisationDetails;

@OneToMany(mappedBy = "organisation",cascade = CascadeType.ALL, orphanRemoval = true)
@JsonManagedReference("stu-org")
private List<Student> studentsList;

@OneToMany(mappedBy = "organisation",cascade = CascadeType.ALL, orphanRemoval = true)
@JsonManagedReference("stu-cla")
private List<Class> classList;

public Organisation() {} //default constructor

public int getOrganisationId() {
	return organisationId;
}

public void setOrganisationId(int organisationId) {
	this.organisationId = organisationId;
}

public OrganisationType getOrganisationType() {
	return organisationType;
}

public void setOrganisationType(OrganisationType organisationType) {
	this.organisationType = organisationType;
}

public String getOrganisationDetails() {
	return organisationDetails;
}

public void setOrganisationDetails(String organisationDetails) {
	this.organisationDetails = organisationDetails;
}

public List<Student> getStudentsList() {
	return studentsList;
}

public void setStudentsList(List<Student> studentsList) {
	this.studentsList = studentsList;
}

public List<Class> getClassList() {
	return classList;
}

public void setClassList(List<Class> classList) {
	this.classList = classList;
}

public Organisation(int organisationId, OrganisationType organisationType, String organisationDetails,
		List<Student> studentsList, List<Class> classList) {
	super();
	this.organisationId = organisationId;
	this.organisationType = organisationType;
	this.organisationDetails = organisationDetails;
	this.studentsList = studentsList;
	this.classList = classList;
}

}
