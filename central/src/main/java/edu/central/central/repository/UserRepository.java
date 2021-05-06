package edu.central.central.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.central.central.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User,String>{
    
}