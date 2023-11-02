package com.assosetvous.assosetvous.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="VOITURE")
public class Voiture extends Vehicule{
	
	@Column(name = "MEDIA")
	private String media;
	@Column(name = "IMMAT")
	private String immatriculation;
	@Column(name = "PFISCALE")
	private String puissanceFiscale;
	@Column(name = "CATEGORIE")
	private String categorie;
	@Column(name = "NBPORTE")
	private int nbPorte;
	@Column(name = "POIDSTOTAL")
	private int poidsTotal;

	public Voiture() {
		super();	
	}

	public Voiture(int anneeModel, double prix) {
		super(anneeModel, prix);	
	}

	public Voiture(Long id, int anneeModel, double prix) {
		super(id, anneeModel, prix);
	}

	public String getMedia() {
		return media;
	}

	public void setMedia(String media) {
		this.media = media;
	}

	public String getImmatriculation() {
		return immatriculation;
	}

	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	public String getPuissanceFiscale() {
		return puissanceFiscale;
	}

	public void setPuissanceFiscale(String puissanceFiscale) {
		this.puissanceFiscale = puissanceFiscale;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public int getNbPorte() {
		return nbPorte;
	}

	public void setNbPorte(int nbPorte) {
		this.nbPorte = nbPorte;
	}

	public int getPoidsTotal() {
		return poidsTotal;
	}

	public void setPoidsTotal(int poidsTotal) {
		this.poidsTotal = poidsTotal;
	}
	
	@Override
	public String toString() {
		return "Voiture [media=" + media + ", immatriculation=" + immatriculation + ", puissanceFiscale=" + puissanceFiscale + "]";
	}
	
	public String demarrer() {
		return "Voiture démarré !!";
	}
	
	


	public String accelerer() {
		return "Voiture accelère !!";
	}

}
