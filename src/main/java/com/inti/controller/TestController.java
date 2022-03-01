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

import com.inti.entities.Test;
import com.inti.service.interfaces.ITestService;

@RestController
@CrossOrigin
public class TestController {
	
	@Autowired
	ITestService testService;
	
	@RequestMapping(value = "tests", method = RequestMethod.GET)
	public List<Test> findAll(){
		return testService.findAll();
	}
	
	@GetMapping("tests/{idtest}")
	public Test findOne(@PathVariable("idtest") Long IdTest) {
		return testService.findOne(IdTest);
	}
	
	@PostMapping("tests")
	public Test saveTest(@RequestBody Test test) {
		return testService.save(test);
	}
	
	@DeleteMapping("tests/{idtest}")
	public void deleteTest(@PathVariable("idtest") Long IdTest) {
		testService.delete(IdTest);
	}
	
	@PutMapping("tests/{idtest}")
	public Test updateTest(@PathVariable("idtest")Long idTest, @RequestBody Test test) {
		Test objtest = testService.findOne(idTest);
		objtest.setNiveau(test.getNiveau());
		objtest.setResultats(test.getResultats());
		objtest.setType(test.getType());
		return testService.save(objtest);
	}
	
}
