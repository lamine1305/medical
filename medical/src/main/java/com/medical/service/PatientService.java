package com.medical.service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medical.dao.Patient;

import repositories.PatientRepository;

@Service
public class PatientService {

	@org.springframework.beans.factory.annotation.Autowired(required=true)
	PatientRepository pr;
	private void  addPatient(Patient p)
	{
		if (!pr.existsById(p.getNumeroSecu()))
			pr.save(p);
		
	}
	private void  deletePatient(String idSecu)
	{
		pr.deleteById(idSecu);
	}
	
	private void  updatePatient(Patient p)
	{
		Patient p0=pr.save(p);
	}
	private List<Patient>  findAllPatient()
	{
	List<Patient> li=new ArrayList();  
			li =pr.findAll();
			return li;
	
	}
}
