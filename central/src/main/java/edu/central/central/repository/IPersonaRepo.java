package edu.central.central.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import edu.central.central.domain.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer>{
    
}