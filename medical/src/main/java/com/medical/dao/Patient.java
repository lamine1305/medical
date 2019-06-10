package com.medical.dao;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patient {

	@Id
	String numeroSecu;
	String nom;
	String prenom;
	String dateNessance;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNumeroSecu() {
		return numeroSecu;
	}
	public void setNumeroSecu(String numeroSecu) {
		this.numeroSecu = numeroSecu;
	}
	public String getDateNeassaice() {
		return dateNessance;
	}
	public void setDateNessance(String dateNessance) {
		this.dateNessance = dateNessance;
	}
	public Patient(String nom, String prenom, String numeroSecu, String dateNeassaice) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.numeroSecu = numeroSecu;
		this.dateNessance = dateNessance;
	}
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
