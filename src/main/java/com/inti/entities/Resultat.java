package com.inti.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Resultat {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idResultat;
	private int score;
	@ManyToOne
	@JoinColumn (name = "id_test")
	private Test test;
	@ManyToOne
	@JoinColumn(name = "id_freelancer")
	private Freelancer freelancer;
	
	public Resultat() {
	}

	public Resultat(int score) {
		this.score = score;
	}

	public Resultat(Long idResultat, int score, Test test, Freelancer freelancer) {
		super();
		this.idResultat = idResultat;
		this.score = score;
		this.test = test;
		this.freelancer = freelancer;
	}

	public Long getIdResultat() {
		return idResultat;
	}

	public void setIdResultat(Long idResultat) {
		this.idResultat = idResultat;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	public Freelancer getFreelancer() {
		return freelancer;
	}

	public void setFreelancer(Freelancer freelancer) {
		this.freelancer = freelancer;
	}

	@Override
	public String toString() {
		return "Resultat [idResultat=" + idResultat + ", score=" + score + "]";
	}
	
}
