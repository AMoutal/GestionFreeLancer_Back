package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
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

import com.inti.entities.Utilisateur;
import com.inti.service.interfaces.IUtilisateurService;

@RestController
@CrossOrigin
public class UtilisateurController {

	@Autowired 
	IUtilisateurService utilisateurService;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@RequestMapping(value="users", method=RequestMethod.GET)
	public List<Utilisateur> findAll(){
		return utilisateurService.findAll();
	}
	
	@GetMapping("users/{idU}") 
	public Utilisateur findOne(@PathVariable("idU")Long idUser) { 
		return utilisateurService.findOne(idUser); 
	}

	@PostMapping("users") 
	public Utilisateur saveUtilisateur(@RequestBody Utilisateur user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		return utilisateurService.save(user);
	}
	
	@DeleteMapping("users/{idUser}")
	public void deleteUtilisateur(@PathVariable("idUser")Long idUser) {
		utilisateurService.delete(idUser);
	}
	
	@PutMapping("users/{idU}")
	public Utilisateur updateUtilisateur(@PathVariable("idU") Long idUser, @RequestBody Utilisateur user) {
		Utilisateur currentUtilisateur=utilisateurService.findOne(idUser);
		currentUtilisateur.setNomUser(user.getNomUser());
		currentUtilisateur.setPrenomUser(user.getPrenomUser());
		currentUtilisateur.setUsername(user.getUsername());
		currentUtilisateur.setPassword(passwordEncoder.encode(user.getPassword()));
		currentUtilisateur.setEmailUser(user.getEmailUser());
		currentUtilisateur.setRoles(user.getRoles());
		return utilisateurService.save(currentUtilisateur);
	}
		
	
}
