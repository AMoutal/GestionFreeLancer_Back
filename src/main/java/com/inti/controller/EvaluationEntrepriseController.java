package com.inti.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.EvaluationEntreprise;
import com.inti.service.interfaces.IEvaluationEntrepriseService;

@RestController
@CrossOrigin
public class EvaluationEntrepriseController {
		
		@Autowired 
		IEvaluationEntrepriseService evaluationEntrepriseService;
		
		@RequestMapping(value="evaluationEntreprise", method=RequestMethod.GET)
		public List<EvaluationEntreprise> findAll(){
			return evaluationEntrepriseService.findAll();
		}
		
		@GetMapping("evaluationEntreprise/{idE}") 
		public EvaluationEntreprise findOne(@PathVariable("idE")Long idEvaluationEntreprise) { 
			return evaluationEntrepriseService.findOne(idEvaluationEntreprise); 
		}

		@PostMapping("evaluationEntreprise") 
		public EvaluationEntreprise saveEvaluationEntreprise(@RequestBody EvaluationEntreprise evaluationEntreprise) {
			return evaluationEntrepriseService.save(evaluationEntreprise);
		}
		

		@DeleteMapping("evaluationEntreprise/{idE}")
		public void deleteEntreprise(@PathVariable("idE") Long idEvaluationEntreprise) {
			evaluationEntrepriseService.delete(idEvaluationEntreprise);
		}
		
		@PutMapping("evaluationEntreprise/{idE}")
		public EvaluationEntreprise updateEvaluationEntreprise(@PathVariable("idE") Long idEvaluationEntreprise,@RequestBody EvaluationEntreprise evaluationEntreprise) {
			
			EvaluationEntreprise currentEvaluationEntreprise = evaluationEntrepriseService.findOne(idEvaluationEntreprise);
			
			currentEvaluationEntreprise.setCommentaire(null);
			currentEvaluationEntreprise.setScore(0);
			
			
			return evaluationEntrepriseService.save(currentEvaluationEntreprise);
		}
}