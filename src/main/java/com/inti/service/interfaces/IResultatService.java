package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Resultat;

public interface IResultatService {

	List<Resultat> findAll();
	Resultat findOne(Long idResultat);
	Resultat save(Resultat resultat);
	void delete(Long idResultat);
	
}
