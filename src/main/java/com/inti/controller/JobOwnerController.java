package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.JobOwner;
import com.inti.service.interfaces.IJobOwnerService;

@RestController 
public class JobOwnerController {
	@Autowired
	IJobOwnerService jobOwnerService;
	
	@Autowired
	PasswordEncoder passwordEncoder;

	@GetMapping("jobOwner") 
	public List<JobOwner> findAll() {
		return jobOwnerService.findAll();
	}

	@GetMapping("jobOwner/{idU}") 
	public JobOwner findOne(@PathVariable("idJ") Long idJobOwner) 
	{
		return jobOwnerService.findOne(idJobOwner); 
	}

	@PostMapping("jobOwner") 
	public JobOwner saveJobOwner(@RequestBody JobOwner jobOwner) {
		jobOwner.setPassword(passwordEncoder.encode(jobOwner.getPassword()));
		return jobOwnerService.save(jobOwner);
	}

	@DeleteMapping("jobOwner/{idJ}")
	public void deleteJobOwner(@PathVariable("idJ") Long idJobOwner) {
		jobOwnerService.delete(idJobOwner);
	}
	
	@PutMapping("jobOwner/{idJ}")
	public JobOwner updateJobOwner(@PathVariable("idJ") Long idJobOwner, @RequestBody JobOwner jobOwner) {
		JobOwner currentJobOwner = jobOwnerService.findOne(idJobOwner);
		
		currentJobOwner.setNomUser(jobOwner.getNomUser());
		currentJobOwner.setPrenomUser(jobOwner.getPrenomUser());
		currentJobOwner.setUsername(jobOwner.getUsername());
		currentJobOwner.setPassword(passwordEncoder.encode(jobOwner.getPassword()));
		currentJobOwner.setEmailUser(jobOwner.getEmailUser());
		currentJobOwner.setRoles(jobOwner.getRoles());
		
		currentJobOwner.setDepartement(jobOwner.getDepartement());
		currentJobOwner.setMetier(jobOwner.getMetier());
		currentJobOwner.setEntreprise(jobOwner.getEntreprise());
		currentJobOwner.setListe_evaluation(jobOwner.getListe_evaluation());
		currentJobOwner.setListe_projet(jobOwner.getListe_projet());
		
		return jobOwnerService.save(currentJobOwner);
	}

	

}
