package com.medical.dao;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RendezVous {

	@Id
	private String idRdv;
	private Date dateRdv;
	public String getDiRdv() {
		return idRdv;
	}
	public void setDiRdv(String diRdv) {
		this.idRdv = diRdv;
	}
	public Date getDateRdv() {
		return dateRdv;
	}
	public void setDateRdv(Date dateRdv) {
		this.dateRdv = dateRdv;
	}
	public RendezVous() {
		super();
	}
	
	
}
