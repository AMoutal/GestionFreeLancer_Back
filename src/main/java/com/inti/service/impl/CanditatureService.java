package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Candidature;
import com.inti.repositories.CandidatureRepository;
import com.inti.service.interfaces.ICanditatureService;
@Service
public class CanditatureService implements ICanditatureService {

	@Autowired
	CandidatureRepository  candidatureRepository;
	
	@Override
	public List<Candidature> findAll() {
		
		return candidatureRepository.findAll();
	}

	@Override
	public Candidature save(Candidature Canditature) {
		// TODO Auto-generated method stub
		return candidatureRepository.save(Canditature);
	}

	@Override
	public void delete(Long idCanditature) {
		
	candidatureRepository.deleteById(idCanditature);
		
	}

	@Override
	public Candidature findOne(Long idCanditature) {
		
		return candidatureRepository.findById(idCanditature).get();
	}

}
