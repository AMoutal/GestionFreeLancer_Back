package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Freelancer;
import com.inti.service.interfaces.IFreelancerService;

@RestController
@CrossOrigin
public class FreelancerController {
	
	@Autowired 
	IFreelancerService freelancerService;
	
	@RequestMapping(value="freelancers", method=RequestMethod.GET)
	public List<Freelancer> findAll(){
		return freelancerService.findAll();
	}
	
	@GetMapping("freelancers/{idF}") 
	public Freelancer findOne(@PathVariable("idF")Long idUser) { 
		return freelancerService.findOne(idUser); 
	}

	@PostMapping("freelancers") 
	public Freelancer saveFreelancer(@RequestBody Freelancer freelancer) {
		return freelancerService.save(freelancer);
	}
	
	@DeleteMapping("freelancers/{idFreelancer}")
	public void deleteFreelancer(@PathVariable("idFreelancer")Long idUser) {
		freelancerService.delete(idUser);
	}
	
	@PutMapping("freelancers/{idF}")
	public Freelancer updateFreelancer(@PathVariable("idF") Long idUser, @RequestBody Freelancer freelancer) {
		Freelancer currentFreelancer=freelancerService.findOne(idUser);
		currentFreelancer.setMetier(freelancer.getMetier());
		currentFreelancer.setDisponible(freelancer.isDisponible());
		currentFreelancer.setCv(freelancer.getCv());
		currentFreelancer.setResultats(freelancer.getResultats());
		currentFreelancer.setNomUser(freelancer.getNomUser());
		currentFreelancer.setPrenomUser(freelancer.getPrenomUser());
		currentFreelancer.setUsername(freelancer.getUsername());
		currentFreelancer.setPassword(freelancer.getPassword());
		currentFreelancer.setEmailUser(freelancer.getEmailUser());
		currentFreelancer.setRoles(freelancer.getRoles());
		return freelancerService.save(currentFreelancer);
	}

}
