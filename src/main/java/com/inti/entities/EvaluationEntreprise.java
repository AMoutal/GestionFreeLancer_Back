package com.inti.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
public class EvaluationEntreprise {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int score;
	private String commentaire;
	@JsonProperty(access = Access.WRITE_ONLY)
	@ManyToOne
	private Freelancer freelancer;
	@JsonProperty(access = Access.WRITE_ONLY)
	@ManyToOne
	private Entreprise entreprise;
	
	
	
	public EvaluationEntreprise() {
	
	}
	public EvaluationEntreprise(Long id, int score, String commentaire, Freelancer freelancer, Entreprise entreprise) {
		
		this.id = id;
		this.score = score;
		this.commentaire = commentaire;
		this.freelancer = freelancer;
		this.entreprise = entreprise;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public Freelancer getFreelancer() {
		return freelancer;
	}
	public void setFreelancer(Freelancer freelancer) {
		this.freelancer = freelancer;
	}
	public Entreprise getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}
	
	
	
}
