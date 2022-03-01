package com.inti.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
public class Candidature {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date date;
	private String lettreMotivation;
	@JsonProperty(access = Access.WRITE_ONLY)
	@ManyToOne
	private Freelancer freelancer;
	@JsonProperty(access = Access.WRITE_ONLY)
	@ManyToOne
	private Projet projet;
	
	
	
	public Candidature() {
	
	}

	public Candidature(Long id, Date date, String lettreMotivation, Freelancer freelancer, Projet projet) {
		
		this.id = id;
		this.date = date;
		this.lettreMotivation = lettreMotivation;
		this.freelancer = freelancer;
		this.projet = projet;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getLettreMotivation() {
		return lettreMotivation;
	}

	public void setLettreMotivation(String lettreMotivation) {
		this.lettreMotivation = lettreMotivation;
	}

	public Freelancer getFreelancer() {
		return freelancer;
	}

	public void setFreelancer(Freelancer freelancer) {
		this.freelancer = freelancer;
	}

	public Projet getProjet() {
		return projet;
	}

	public void setProjet(Projet projet) {
		this.projet = projet;
	}
	

	

}
