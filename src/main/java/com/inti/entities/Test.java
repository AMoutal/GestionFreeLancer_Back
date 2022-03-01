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
public class Test {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTest;
	private String type;
	private String niveau;
	@OneToMany(mappedBy = "test")
	private List<Resultat> resultats = new ArrayList<Resultat>();
	
	public Test() {
	}

	public Test(String type, String niveau) {
		this.type = type;
		this.niveau = niveau;
	}

	public Test(String type, String niveau, List<Resultat> resultats) {
		super();
		this.type = type;
		this.niveau = niveau;
		this.resultats = resultats;
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

	public List<Resultat> getResultats() {
		return resultats;
	}

	public void setResultats(List<Resultat> resultats) {
		this.resultats = resultats;
	}

	@Override
	public String toString() {
		return "Test [idTest=" + idTest + ", type=" + type + ", niveau=" + niveau + "]";
	}
	
}
