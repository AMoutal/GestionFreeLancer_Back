package com.inti.model;

import javax.persistence.Embeddable;

@Embeddable
public class Adresse {
	
	private String adresse;
	private int cp;
	private String ville;
	private String pays;
	
	public Adresse() {
		
	}

	public Adresse(String adresse, int cp, String ville, String pays) {
		super();
		this.adresse = adresse;
		this.cp = cp;
		this.ville = ville;
		this.pays = pays;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public int getCp() {
		return cp;
	}


	public void setCp(int cp) {
		this.cp = cp;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public String getPays() {
		return pays;
	}


	public void setPays(String pays) {
		this.pays = pays;
	}
	 
	
	
	
}
