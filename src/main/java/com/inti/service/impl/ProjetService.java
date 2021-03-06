package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Projet;
import com.inti.repositories.ProjetRepository;
import com.inti.service.interfaces.IProjetService;

@Service
public class ProjetService implements IProjetService
{
	@Autowired
	ProjetRepository projetRepository;
	
	@Override
	public List<Projet> findAll() 
	{
		return projetRepository.findAll();
	}

	@Override
	public Projet findOne(Long idProjet) 
	{
		return projetRepository.findById(idProjet).get();
	}

	@Override
	public Projet save(Projet projet) 
	{
		return projetRepository.save(projet);
	}

	@Override
	public void delete(Long idProjet) 
	{
		projetRepository.deleteById(idProjet);
	}	
}
