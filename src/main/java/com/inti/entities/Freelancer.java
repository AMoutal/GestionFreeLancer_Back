package com.inti.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

@Entity 
@DiscriminatorValue(value = "freelancer")
public class Freelancer extends Utilisateur implements Serializable{
	
	private String metier;
	private boolean disponible;
	@Lob
	private byte[] cv;
	
	@OneToMany(mappedBy="freelancer")
	List <Resultat> resultats = new ArrayList<>();

	public Freelancer() {
		super();
	}

	public Freelancer(String metier, boolean disponible, byte[] cv, List<Resultat> resultats) {
		super();
		this.metier = metier;
		this.disponible = disponible;
		this.cv = cv;
		this.resultats = resultats;
	}

	public String getMetier() {
		return metier;
	}

	public void setMetier(String metier) {
		this.metier = metier;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public byte[] getCv() {
		return cv;
	}

	public void setCv(byte[] cv) {
		this.cv = cv;
	}

	public List<Resultat> getResultats() {
		return resultats;
	}

	public void setResultats(List<Resultat> resultats) {
		this.resultats = resultats;
	}

	@Override
	public String toString() {
		return "Freelancer [metier=" + metier + ", disponible=" + disponible + ", cv=" + Arrays.toString(cv)
				+ ", toString()=" + super.toString() + "]";
	}
	


}
