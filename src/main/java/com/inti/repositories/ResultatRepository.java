package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.inti.entities.Resultat;

@Repository
public interface ResultatRepository extends JpaRepository<Resultat, Long>{

}
