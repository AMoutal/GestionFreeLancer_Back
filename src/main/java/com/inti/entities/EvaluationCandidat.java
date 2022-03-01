package com.inti.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;


@Entity
public class EvaluationCandidat implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEvaluationCandidat;
	private int score;
	private boolean bilan;
	private String commentaire;
	@JsonProperty(access = Access.WRITE_ONLY)
	@ManyToOne
	@JoinColumn(name = "id_freelancer")
	private Freelancer freelancer;
	@JsonProperty(access = Access.WRITE_ONLY)
	@ManyToOne
	@JoinColumn(name = "id_jobOwner")
	private JobOwner jobOwner;
	
	public EvaluationCandidat() {
	}

	public EvaluationCandidat(int score, boolean bilan, String commentaire) {
		this.score = score;
		this.bilan = bilan;
		this.commentaire = commentaire;
	}

	public EvaluationCandidat(int score, boolean bilan, String commentaire, Freelancer freelancer, JobOwner jobOwner) {
		super();
		this.score = score;
		this.bilan = bilan;
		this.commentaire = commentaire;
		this.freelancer = freelancer;
		this.jobOwner = jobOwner;
	}

	public Long getIdEvaluationCandidat() {
		return idEvaluationCandidat;
	}

	public void setIdEvaluationCandidat(Long idEvaluationCandidat) {
		this.idEvaluationCandidat = idEvaluationCandidat;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public boolean isBilan() {
		return bilan;
	}

	public void setBilan(boolean bilan) {
		this.bilan = bilan;
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

	public JobOwner getJobOwner() {
		return jobOwner;
	}

	public void setJobOwner(JobOwner jobOwner) {
		this.jobOwner = jobOwner;
	}

	@Override
	public String toString() {
		return "EvaluationCandidat [idEvaluationCandidat=" + idEvaluationCandidat + ", score=" + score + ", bilan="
				+ bilan + ", commentaire=" + commentaire + "]";
	}

}
