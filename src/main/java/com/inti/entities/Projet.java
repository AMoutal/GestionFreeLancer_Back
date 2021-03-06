package com.inti.entities;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
public class Projet 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProjet;
	
	private String nom;
	private double remuneration;
	private String description;
	
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	
	@Temporal(TemporalType.DATE)
	private Date dateFin;
	
	private boolean etat;
	
	@OneToMany(mappedBy = "projet", cascade = CascadeType.ALL)
	private Set<Freelancer> liste_freelancer = new HashSet<>();
	
	@OneToMany(mappedBy = "projet", cascade = CascadeType.ALL)
	private Set<Candidature> liste_candidature = new HashSet<>();

	@JsonProperty(access = Access.WRITE_ONLY)
	@ManyToOne
	JobOwner jobOwner;

	public Long getIdProjet() {
		return idProjet;
	}

	public void setIdProjet(Long idProjet) {
		this.idProjet = idProjet;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getRemuneration() {
		return remuneration;
	}

	public void setRemuneration(double remuneration) {
		this.remuneration = remuneration;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public boolean isEtat() {
		return etat;
	}

	public void setEtat(boolean etat) {
		this.etat = etat;
	}

	public Set<Freelancer> getListe_freelancer() {
		return liste_freelancer;
	}

	public void setListe_freelancer(Set<Freelancer> liste_freelancer) {
		this.liste_freelancer = liste_freelancer;
	}

	public Set<Candidature> getListe_candidature() {
		return liste_candidature;
	}

	public void setListe_candidature(Set<Candidature> liste_candidature) {
		this.liste_candidature = liste_candidature;
	}

	public JobOwner getJobOwner() {
		return jobOwner;
	}

	public void setJobOwner(JobOwner jobOwner) {
		this.jobOwner = jobOwner;
	}
	

	

}
