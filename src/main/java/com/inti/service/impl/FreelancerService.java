package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Freelancer;
import com.inti.repositories.FreelancerRepository;
import com.inti.service.interfaces.IFreelancerService;

@Service
public class FreelancerService implements IFreelancerService{

	@Autowired
	FreelancerRepository freelancerRepository;
	
	@Override
	public List<Freelancer> findAll() {
		return freelancerRepository.findAll();
	}

	@Override
	public Freelancer findOne(Long idFreelancer) {
		return freelancerRepository.findById(idFreelancer).get();
	}

	@Override
	public Freelancer save(Freelancer freelancer) {
		return freelancerRepository.save(freelancer);
	}

	@Override
	public void delete(Long idFreelancer) {
		freelancerRepository.deleteById(idFreelancer);
	}

}
