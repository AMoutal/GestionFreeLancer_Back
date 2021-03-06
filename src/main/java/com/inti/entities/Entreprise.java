package com.inti.entities;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.inti.model.Adresse;

@Entity
public class Entreprise 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEntreprise;
	
	private String nom;
	
	@Embedded
	private Adresse adresse;
	
	private String email;
	
	@JsonProperty(access = Access.WRITE_ONLY)
	@OneToMany(mappedBy = "entreprise", cascade = CascadeType.ALL)
	private Set<JobOwner> liste_jobowner = new HashSet<>();
	
	@OneToMany(mappedBy = "entreprise", cascade = CascadeType.ALL)
	private Set<EvaluationEntreprise> liste_evaluation = new HashSet<>();

	public Long getIdEntreprise() {
		return idEntreprise;
	}

	public void setIdEntreprise(Long idEntreprise) {
		this.idEntreprise = idEntreprise;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Set<JobOwner> getListe_jobowner() {
		return liste_jobowner;
	}

	public void setListe_jobowner(Set<JobOwner> liste_jobowner) {
		this.liste_jobowner = liste_jobowner;
	}

	public Set<EvaluationEntreprise> getListe_evaluation() {
		return liste_evaluation;
	}

	public void setListe_evaluation(Set<EvaluationEntreprise> liste_evaluation) {
		this.liste_evaluation = liste_evaluation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
