package com.inti.entities;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@DiscriminatorValue(value = "jobowner")
public class JobOwner extends Utilisateur
{
	
	private String departement;
	private String metier;
	
	//@JsonProperty(access = Access.WRITE_ONLY)
	
	@JsonIdentityInfo(generator=ObjectIdGenerators.UUIDGenerator.class, property="@id")
	@ManyToOne
	private Entreprise entreprise;
	
	@OneToMany(mappedBy = "jobOwner", cascade = CascadeType.ALL)
	private Set<Projet> liste_projet = new HashSet<>();
	
	@OneToMany(mappedBy = "jobOwner", cascade = CascadeType.ALL)
	private Set<EvaluationCandidat> liste_evaluation = new HashSet<>();
	
	public String getDepartement() 
	{
		return departement;
	}
	public void setDepartement(String departement) 
	{
		this.departement = departement;
	}
	public String getMetier() 
	{
		return metier;
	}
	public void setMetier(String metier) 
	{
		this.metier = metier;
	}
	public Entreprise getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}
	public Set<Projet> getListe_projet() {
		return liste_projet;
	}
	public void setListe_projet(Set<Projet> liste_projet) {
		this.liste_projet = liste_projet;
	}
	public Set<EvaluationCandidat> getListe_evaluation() {
		return liste_evaluation;
	}
	public void setListe_evaluation(Set<EvaluationCandidat> liste_evaluation) {
		this.liste_evaluation = liste_evaluation;
	}
	

}
