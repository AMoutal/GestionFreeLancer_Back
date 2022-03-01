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

import com.inti.entities.Role;
import com.inti.service.interfaces.IRoleService;

@RestController
@CrossOrigin
public class RoleController {

	@Autowired 
	IRoleService roleService;
	
	@RequestMapping(value="roles", method=RequestMethod.GET)
	public List<Role> findAll(){
		return roleService.findAll();
	}
	
	@GetMapping("roles/{idR}") 
	public Role findOne(@PathVariable("idR")Long idRole) { 
		return roleService.findOne(idRole); 
	}

	@PostMapping("roles") 
	public Role saveRole(@RequestBody Role role) {
		return roleService.save(role);
	}
	
	@DeleteMapping("roles/{idRole}")
	public void deleteRole(@PathVariable("idRole")Long idRole) {
		roleService.delete(idRole);
	}
	
	@PutMapping("roles/{idR}")
	public Role updateRole(@PathVariable("idR") Long idRole, @RequestBody Role role) {
		Role currentRole=roleService.findOne(idRole);
		currentRole.setLibelle(role.getLibelle());
		return roleService.save(currentRole);
	}
}
