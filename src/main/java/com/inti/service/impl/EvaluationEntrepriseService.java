package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.EvaluationEntreprise;
import com.inti.repositories.EvaluationEntrepriseRepository;
import com.inti.service.interfaces.IEvaluationEntrepriseService;

@Service
public class EvaluationEntrepriseService implements  IEvaluationEntrepriseService {

	@Autowired
	EvaluationEntrepriseRepository  evaluationEntrepriseRepository;
	
	@Override
	public List<EvaluationEntreprise> findAll() {
		
		return evaluationEntrepriseRepository.findAll();
		}

	@Override
	public EvaluationEntreprise save(EvaluationEntreprise evaluationEntreprise) {
		
		return evaluationEntrepriseRepository.save(evaluationEntreprise);
	}

	@Override
	public void delete(Long idEvaluationEntreprise) {
		evaluationEntrepriseRepository.deleteById(idEvaluationEntreprise);
		
	}

	@Override
	public EvaluationEntreprise findOne(Long idEvaluationEntreprise) {
	
		return evaluationEntrepriseRepository.findById(idEvaluationEntreprise).get();
	}

	
}
