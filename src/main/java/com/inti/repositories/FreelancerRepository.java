package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Freelancer;
import com.inti.entities.Role;

@Repository
public interface FreelancerRepository extends JpaRepository<Freelancer, Long>{

}
