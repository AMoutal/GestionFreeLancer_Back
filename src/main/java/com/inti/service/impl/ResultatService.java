package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Resultat;
import com.inti.repositories.ResultatRepository;
import com.inti.service.interfaces.IResultatService;

@Service
public class ResultatService implements IResultatService{

	@Autowired
	ResultatRepository resultatRepository;

	@Override
	public List<Resultat> findAll() {
		return resultatRepository.findAll();
	}

	@Override
	public Resultat findOne(Long idResultat) {
		return resultatRepository.findById(idResultat).get();
	}

	@Override
	public Resultat save(Resultat resultat) {
		return resultatRepository.save(resultat);
	}

	@Override
	public void delete(Long idResultat) {
		resultatRepository.deleteById(idResultat);
	}
	
	
}
