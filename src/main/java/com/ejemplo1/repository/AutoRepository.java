package com.ejemplo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejemplo1.repository.entities.AutoModel;

@Repository
public interface AutoRepository extends JpaRepository<AutoModel, Integer> {
	
}
