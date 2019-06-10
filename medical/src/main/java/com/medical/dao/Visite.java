package com.medical.dao;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Visite {

	@Id
	String dateVisite;

	public String getDateVisite() {
		return dateVisite;
	}

	public void setDateVisite(String dateVisite) {
		this.dateVisite = dateVisite;
	}

	public Visite() {
		super();
		// TODO Auto-generated constructor stub
	}
	
//	Patient patient;
}
