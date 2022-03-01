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

import com.inti.entities.Resultat;
import com.inti.service.interfaces.IResultatService;

@RestController
@CrossOrigin
public class ResultatController {
	
	@Autowired
	IResultatService resultatService;
	
	@RequestMapping(value = "resultats", method = RequestMethod.GET)
	public List<Resultat> findAll(){
		return resultatService.findAll();
	}
	
	@GetMapping("resultats/{idresultat}")
	public Resultat findOne(@PathVariable("idresultat") Long IdResultat) {
		return resultatService.findOne(IdResultat);
	}
	
	@PostMapping("resultats")
	public Resultat saveResultat(@RequestBody Resultat resultat) {
		return resultatService.save(resultat);
	}
	
	@DeleteMapping("resultats/{idresultat}")
	public void deleteResultat(@PathVariable("idresultat") Long IdResultat) {
		resultatService.delete(IdResultat);
	}
	
	@PutMapping("resultats/{idresultat}")
	public Resultat updateResultat(@PathVariable("idresultat")Long idResultat,@RequestBody Resultat resultat) {
		Resultat objresultat = resultatService.findOne(idResultat);
		objresultat.setFreelancer(resultat.getFreelancer());
		objresultat.setScore(resultat.getScore());
		objresultat.setTest(resultat.getTest());
		return resultatService.save(objresultat);
	}
	
}
