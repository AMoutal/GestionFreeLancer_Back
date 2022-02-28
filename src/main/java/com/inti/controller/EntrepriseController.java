package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Entreprise;
import com.inti.service.interfaces.IEntrepriseService;

@RestController 
public class EntrepriseController {
	@Autowired
	IEntrepriseService entrepriseService;

	@GetMapping("entreprise") 
	public List<Entreprise> findAll() {
		return entrepriseService.findAll();
	}

	@GetMapping("entreprise/{idE}") 
	public Entreprise findOne(@PathVariable("idE") Long idEntreprise) 
	{
		return entrepriseService.findOne(idEntreprise); 
	}

	@PostMapping("entreprise") 
	public Entreprise saveEntreprise(@RequestBody Entreprise entreprise) {
		return entrepriseService.save(entreprise);
	}

	@DeleteMapping("entreprise/{idE}")
	public void deleteEntreprise(@PathVariable("idE") Long idEntreprise) {
		entrepriseService.delete(idEntreprise);
	}
	/*
	@PutMapping("jobOwner/{idJ}")
	public JobOwner updateJobOwner(@PathVariable("idJ") Long idJobOwner, @RequestBody JobOwner jobOwner) {
		JobOwner currentUtilisateur = jobOwnerService.findOne(idJobOwner);
		
		currentUtilisateur.setNom(jobOwner.getNom());
		currentUtilisateur.setPrenom(jobOwner.getPrenom());
		currentUtilisateur.setUsername(user.getUsername());
		currentUtilisateur.setPassword(user.getPassword());
		
		return userService.save(currentUtilisateur);
	}*/

	

}