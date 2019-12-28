package com.example.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgentDao extends CrudRepository<Agent, Integer> {

	public Optional<Agent> findById(int arg0);
	
	//public  <S extends Agent> S save(Agent agent);
	
	
}
