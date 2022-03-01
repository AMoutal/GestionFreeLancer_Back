
package com.inti.service.interfaces;

import java.util.List;


import com.inti.entities.EvaluationEntreprise;


public interface IEvaluationEntrepriseService {
	
	List<EvaluationEntreprise> findAll();
	EvaluationEntreprise save( EvaluationEntreprise EvaluationEntreprise);
	void delete(Long EvaluationEntreprise);
	EvaluationEntreprise findOne(Long idEvaluationEntreprise);
	

}