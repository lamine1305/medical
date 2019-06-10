package com.medical.dao;

import javax.persistence.Entity;
import javax.persistence.Id;


public class Dossier {

	private int idDossier;
	private Visite visite;
	public int getIdDossier() {
		return idDossier;
	}
	public void setIdDossier(int idDossier) {
		this.idDossier = idDossier;
	}
	public Visite getVisite() {
		return visite;
	}
	public void setVisite(Visite visite) {
		this.visite = visite;
	}
	public Dossier() {
		super();
	}
	
	
}
