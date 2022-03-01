package com.inti.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Resultat {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idResultat;
	private int score;
	@OneToMany(mappedBy = "resultat")
	private List<Test> tests = new ArrayList<Test>();
	@OneToMany(mappedBy = "resultat")
	private List<Freelancer> freelancers = new ArrayList<Freelancer>();
	
	public Resultat() {
	}

	public Resultat(int score) {
		this.score = score;
	}

	public Resultat(int score, List<Test> tests, List<Freelancer> freelancers) {
		this.score = score;
		this.tests = tests;
		this.freelancers = freelancers;
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

	public List<Test> getTests() {
		return tests;
	}

	public void setTests(List<Test> tests) {
		this.tests = tests;
	}

	public List<Freelancer> getFreelancers() {
		return freelancers;
	}

	public void setFreelancers(List<Freelancer> freelancers) {
		this.freelancers = freelancers;
	}

	@Override
	public String toString() {
		return "Resultat [idResultat=" + idResultat + ", score=" + score + "]";
	}
	
}
