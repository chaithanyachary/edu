package com.example.organisation.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity@Table(name = "grants_for_class")
public class GrantsForClass implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 5284949493858181727L;
@Id
private int grantId;
@Id
private int classId;
}
