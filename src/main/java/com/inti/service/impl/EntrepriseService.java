package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Entreprise;
import com.inti.repositories.EntrepriseRepository;
import com.inti.service.interfaces.IEntrepriseService;

@Service
public class EntrepriseService implements IEntrepriseService
{
	@Autowired
	EntrepriseRepository entrepriseRepository;
	
	@Override
	public List<Entreprise> findAll() 
	{
		return entrepriseRepository.findAll();
	}

	@Override
	public Entreprise findOne(Long idEntreprise) 
	{
		return entrepriseRepository.findById(idEntreprise).get();
	}

	@Override
	public Entreprise save(Entreprise entreprise) 
	{
		return entrepriseRepository.save(entreprise);
	}

	@Override
	public void delete(Long idEntreprise) 
	{
		entrepriseRepository.deleteById(idEntreprise);
	}	
}
