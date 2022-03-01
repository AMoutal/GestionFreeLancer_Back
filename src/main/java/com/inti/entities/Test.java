package com.inti.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Test {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTest;
	private String type;
	private String niveau;
	@ManyToOne
	@JoinColumn(name = "id_resultat")
	private Resultat resultat;
	
	public Test() {
	}

	public Test(String type, String niveau) {
		this.type = type;
		this.niveau = niveau;
	}

	public Test(String type, String niveau, Resultat resultat) {
		this.type = type;
		this.niveau = niveau;
		this.resultat = resultat;
	}

	public Long getIdTest() {
		return idTest;
	}

	public void setIdTest(Long idTest) {
		this.idTest = idTest;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	public Resultat getResultat() {
		return resultat;
	}

	public void setResultat(Resultat resultat) {
		this.resultat = resultat;
	}

	@Override
	public String toString() {
		return "Test [idTest=" + idTest + ", type=" + type + ", niveau=" + niveau + "]";
	}
	
}
