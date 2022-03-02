package com.inti.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Freelancer;
import com.inti.entities.JobOwner;
import com.inti.entities.Utilisateur;
import com.inti.service.interfaces.IFreelancerService;
import com.inti.service.interfaces.IJobOwnerService;
import com.inti.service.interfaces.IUtilisateurService;

@RestController
@RequestMapping(value = "/login")
public class LoginController {
	@Autowired
	IUtilisateurService utilisateurService;
	@Autowired
	IFreelancerService freelancerService;
	@Autowired
	IJobOwnerService jobOwnerService;
	
	@CrossOrigin
	@RequestMapping(value="/user")
	public Utilisateur login(Principal principal) {
		return utilisateurService.findByUsername(principal.getName());
	}

	@CrossOrigin
	@RequestMapping(value="/freelancer")
	public Freelancer loginF(Principal principal) {
		
		return freelancerService.findByUsername(principal.getName());
	}

	@CrossOrigin
	@RequestMapping(value="/jobOwner")
	public JobOwner loginJ(Principal principal) {
		return jobOwnerService.findByUsername(principal.getName());
	}

}
