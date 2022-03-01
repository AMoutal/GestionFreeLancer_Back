package com.inti.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class EvaluationCandidat implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEvaluationCandidat;
	private int score;
	private boolean bilan;
	private String commentaire;
	@OneToMany(mappedBy = "evaluationCandidat")
	private List<Freelancer> freelancers = new ArrayList<Freelancer>();
	@OneToMany(mappedBy = "evaluationCandidat")
	private List<JobOwner> jobowners = new ArrayList<JobOwner>();
	
	public EvaluationCandidat() {
	}

	public EvaluationCandidat(int score, boolean bilan, String commentaire) {
		this.score = score;
		this.bilan = bilan;
		this.commentaire = commentaire;
	}

	public EvaluationCandidat(int score, boolean bilan, String commentaire, List<Freelancer> freelancers,
			List<JobOwner> jobowners) {
		this.score = score;
		this.bilan = bilan;
		this.commentaire = commentaire;
		this.freelancers = freelancers;
		this.jobowners = jobowners;
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

	public List<Freelancer> getFreelancers() {
		return freelancers;
	}

	public void setFreelancers(List<Freelancer> freelancers) {
		this.freelancers = freelancers;
	}

	public List<JobOwner> getJobowners() {
		return jobowners;
	}

	public void setJobowners(List<JobOwner> jobowners) {
		this.jobowners = jobowners;
	}

	@Override
	public String toString() {
		return "EvaluationCandidat [idEvaluationCandidat=" + idEvaluationCandidat + ", score=" + score + ", bilan="
				+ bilan + ", commentaire=" + commentaire + "]";
	}

}
