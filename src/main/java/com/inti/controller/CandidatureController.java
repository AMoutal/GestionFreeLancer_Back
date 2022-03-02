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

import com.inti.entities.Candidature;
import com.inti.service.interfaces.ICanditatureService;

@RestController
@CrossOrigin
public class CandidatureController {
		
		@Autowired 
		ICanditatureService canditatureService;
		
		@RequestMapping(value="candidature", method=RequestMethod.GET)
		public List<Candidature> findAll(){
			return canditatureService.findAll();
		}
		
		@GetMapping("candidature/{idC}") 
		public Candidature findOne(@PathVariable("idC")Long idCandidature) { 
			return canditatureService.findOne(idCandidature); 
		}

		@PostMapping("candidature") 
		public Candidature saveCandidature(@RequestBody Candidature candidature) {
			return canditatureService.save(candidature);
		}
		

		@DeleteMapping("candidature/{idC}")
		public void deleteEntreprise(@PathVariable("idC") Long idCandidature) {
			canditatureService.delete(idCandidature);
		}
		
		@PutMapping("candidature/{idC}")
		public Candidature updateCandidature(@PathVariable("idC") Long idCandidature,@RequestBody Candidature canditature) {
			Candidature currentCanditature = canditatureService.findOne(idCandidature);
			currentCanditature.setLettreMotivation(canditature.getLettreMotivation());
			currentCanditature.setFreelancer(canditature.getFreelancer());
			currentCanditature.setProjet(canditature.getProjet());
			
			return canditatureService.save(currentCanditature);
		}

	
}
