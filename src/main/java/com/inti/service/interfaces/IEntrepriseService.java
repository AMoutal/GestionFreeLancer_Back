package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Entreprise;

public interface IEntrepriseService 
{
	List<Entreprise> findAll();
	Entreprise findOne(Long idEntreprise);
	Entreprise save(Entreprise entreprise);
	void delete(Long idEntreprise);
}
