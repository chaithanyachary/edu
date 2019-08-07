package com.example.organisation.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity@Table(name = "organisation_type")
public class OrganisationType {
@Id
private String organisationType;

private String organisationTypeDescription;

public OrganisationType() {}

public String getOrganisationType() {
	return organisationType;
}

public void setOrganisationType(String organisationType) {
	this.organisationType = organisationType;
}

public String getOrganisationTypeDescription() {
	return organisationTypeDescription;
}

public void setOrganisationTypeDescription(String organisationTypeDescription) {
	this.organisationTypeDescription = organisationTypeDescription;
}

public OrganisationType(String organisationType, String organisationTypeDescription) {
	super();
	this.organisationType = organisationType;
	this.organisationTypeDescription = organisationTypeDescription;
}
}