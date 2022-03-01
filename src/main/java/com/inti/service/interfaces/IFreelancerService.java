package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Freelancer;

public interface IFreelancerService {

	List<Freelancer> findAll();
	Freelancer findOne(Long idFreelancer);
	Freelancer save(Freelancer freelancer);
	void delete(Long idFreelancer);
	
}
