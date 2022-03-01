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

import com.inti.entities.Projet;
import com.inti.service.interfaces.IProjetService;

@RestController 
public class ProjetController {
	@Autowired
	IProjetService projetService;

	@GetMapping("projet") 
	public List<Projet> findAll() {
		return projetService.findAll();
	}

	@GetMapping("projet/{idP}") 
	public Projet findOne(@PathVariable("idP") Long idProjet) 
	{
		return projetService.findOne(idProjet); 
	}

	@PostMapping("jobOwner") 
	public Projet saveProjet(@RequestBody Projet projet) {
		return projetService.save(projet);
	}

	@DeleteMapping("projet/{idP}")
	public void deleteProjet(@PathVariable("idP") Long idProjet) {
		projetService.delete(idProjet);
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
