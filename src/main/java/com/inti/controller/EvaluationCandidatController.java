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

import com.inti.entities.EvaluationCandidat;
import com.inti.service.interfaces.IEvaluationCandidatService;

@RestController
@CrossOrigin
public class EvaluationCandidatController {
	
	@Autowired
	IEvaluationCandidatService evaluationCandidatService;
	
	@RequestMapping(value = "evaluationCandidats", method = RequestMethod.GET)
	public List<EvaluationCandidat> findAll(){
		return evaluationCandidatService.findAll();
	}
	
	@GetMapping("evaluationCandidats/{idEC}")
	public EvaluationCandidat findOne(@PathVariable("idEC") Long IdEvaluationCandidat) {
		return evaluationCandidatService.findOne(IdEvaluationCandidat);
	}
	
	@PostMapping("evaluationCandidats")
	public EvaluationCandidat saveEvaluationCandidat(@RequestBody EvaluationCandidat evaluationCandidat) {
		return evaluationCandidatService.save(evaluationCandidat);
	}
	
	@DeleteMapping("evaluationCandidats/{idEC}")
	public void deleteEvaluationCandidat(@PathVariable("idEC") Long IdEvaluationCandidat) {
		evaluationCandidatService.delete(IdEvaluationCandidat);
	}
	
	@PutMapping("evaluationCandidats/{idEC}")
	public EvaluationCandidat updateEvaluationCandidat(@PathVariable("idEC")Long idEvaluationCandidat, EvaluationCandidat evaluationCandidat) {
		EvaluationCandidat objEC = evaluationCandidatService.findOne(idEvaluationCandidat);
		objEC.setBilan(evaluationCandidat.isBilan());
		objEC.setCommentaire(evaluationCandidat.getCommentaire());
		objEC.setScore(evaluationCandidat.getScore());
		objEC.setFreelancer(evaluationCandidat.getFreelancer());
		objEC.setJobOwner(evaluationCandidat.getJobOwner());
		return evaluationCandidatService.save(objEC);
	}
	
}
