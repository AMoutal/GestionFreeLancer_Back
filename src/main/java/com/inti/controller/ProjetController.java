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
	
	@PutMapping("projet/{idP}")
	public Projet updateProjet(@PathVariable("idP") Long idProjet, @RequestBody Projet projet) {
		Projet currentProjet = projetService.findOne(idProjet);
		
		currentProjet.setNom(projet.getNom());
		currentProjet.setRenumeration(projet.getRenumeration());
		currentProjet.setDescription(projet.getDescription());
		currentProjet.setDateDebut(projet.getDateDebut());
		currentProjet.setDateFin(projet.getDateFin());
		currentProjet.setEtat(projet.isEtat());
		currentProjet.setListe_freelancer(projet.getListe_freelancer());
		currentProjet.setListe_candidature(projet.getListe_candidature());
		currentProjet.setJobOwner(projet.getJobOwner());
		
		
		return projetService.save(currentProjet);
	}

	

}
