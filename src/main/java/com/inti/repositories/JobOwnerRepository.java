package com.inti.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.JobOwner;

@Repository
public interface JobOwnerRepository extends JpaRepository<JobOwner, Long>
{
	
}

