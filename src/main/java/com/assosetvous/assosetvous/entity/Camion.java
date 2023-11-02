package com.assosetvous.assosetvous.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="CAMION")


public class Camion extends Vehicule{
	
	@Override
	public String demarrer() {
		return "VRROOOOOMMMM!";
	}
	
	@Override
	public String accelerer() {
		return "RRRRRRRRRRR!";
	}
	//Constructeur par défaut
	public Camion() {
		super();	
	}
	
	public Camion( int anneeModel, double prix) {
		super(anneeModel, prix);
		
	}

	public Camion(Long id, int anneeModel, double prix) {
		super(id, anneeModel, prix);
		
	}


}
