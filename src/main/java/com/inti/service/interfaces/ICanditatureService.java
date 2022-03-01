package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Candidature;



public interface ICanditatureService{

	
	List<Candidature> findAll();
	Candidature save(Candidature Candidature);
	void delete(Long idCandidature);
	Candidature findOne(Long idCandidature);
	
}
