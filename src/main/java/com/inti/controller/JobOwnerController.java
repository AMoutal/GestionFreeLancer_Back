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

import com.inti.entities.JobOwner;
import com.inti.service.interfaces.IJobOwnerService;

@RestController 
public class JobOwnerController {
	@Autowired
	IJobOwnerService jobOwnerService;

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
		return jobOwnerService.save(jobOwner);
	}

	@DeleteMapping("jobOwner/{idJ}")
	public void deleteJobOwner(@PathVariable("idJ") Long idJobOwner) {
		jobOwnerService.delete(idJobOwner);
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
