package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.EvaluationCandidat;
public interface IEvaluationCandidatService {

	List<EvaluationCandidat> findAll();
	EvaluationCandidat findOne(Long idEvaluationCandidat);
	EvaluationCandidat save(EvaluationCandidat evaluationCandidat);
	void delete(Long idEvaluationCandidat);
	
}
