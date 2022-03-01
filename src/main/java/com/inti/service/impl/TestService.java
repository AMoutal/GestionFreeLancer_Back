package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Test;
import com.inti.repositories.TestRepository;
import com.inti.service.interfaces.ITestService;

@Service
public class TestService implements ITestService{

	@Autowired
	TestRepository testRepository;

	@Override
	public List<Test> findAll() {
		return testRepository.findAll();
	}

	@Override
	public Test findOne(Long idTest) {
		return testRepository.findById(idTest).get();
	}

	@Override
	public Test save(Test test) {
		return testRepository.save(test);
	}

	@Override
	public void delete(Long idTest) {
		testRepository.deleteById(idTest);
	}
	
}
