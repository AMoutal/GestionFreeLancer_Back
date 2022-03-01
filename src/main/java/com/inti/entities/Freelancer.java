package com.inti.entities;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity 
@DiscriminatorValue(value = "freelancer")
public class Freelancer extends Utilisateur implements Serializable{
	
	private String metier;
	private boolean disponible;
	@Lob
	private byte[] cv;
	
	@OneToMany(mappedBy="freelancer")
	private Set<Resultat> resultats = new HashSet<>();
	
	@OneToMany(mappedBy="freelancer")
	private Set<EvaluationCandidat> evaluationCandidats = new HashSet<>();
	
	@OneToMany(mappedBy="freelancer")
	private Set<EvaluationEntreprise> evaluationEntreprises = new HashSet<>();
	
	@ManyToOne
	private Projet projet;

	public Freelancer() {
		super();
	}

	public Freelancer(String metier, boolean disponible, byte[] cv, Set<Resultat> resultats) {
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

	public Set<Resultat> getResultats() {
		return resultats;
	}

	public void setResultats(Set<Resultat> resultats) {
		this.resultats = resultats;
	}
	
	

	public Set<EvaluationCandidat> getEvaluationCandidats() {
		return evaluationCandidats;
	}

	public void setEvaluationCandidats(Set<EvaluationCandidat> evaluationCandidats) {
		this.evaluationCandidats = evaluationCandidats;
	}

	public Set<EvaluationEntreprise> getEvaluationEntreprises() {
		return evaluationEntreprises;
	}

	public void setEvaluationEntreprises(Set<EvaluationEntreprise> evaluationEntreprises) {
		this.evaluationEntreprises = evaluationEntreprises;
	}

	public Projet getProjet() {
		return projet;
	}

	public void setProjet(Projet projet) {
		this.projet = projet;
	}

	@Override
	public String toString() {
		return "Freelancer [metier=" + metier + ", disponible=" + disponible + ", cv=" + Arrays.toString(cv)
				+ ", toString()=" + super.toString() + "]";
	}



}
