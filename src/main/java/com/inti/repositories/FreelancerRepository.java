package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Freelancer;

@Repository
public interface FreelancerRepository extends JpaRepository<Freelancer, Long>{

	Freelancer findByUsername(String username);
}
