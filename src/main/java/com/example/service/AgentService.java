package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.Agent;
import com.example.dao.AgentDao;
import com.example.info.GetAgentRequestInfo;

@Service
public class AgentService {

	@Autowired
	public AgentDao agentDao;
	
	
	public Optional<Agent> getAgentDetails(int agentId) {
		
		return agentDao.findById(agentId);
	}
	
   public void addAgent(GetAgentRequestInfo reqInfo) {
		
		 agentDao.save(new Agent(reqInfo.getAgentId(), reqInfo.getAgentName(), reqInfo.getAgentSalary()));
	}

   public void deleteAgent(GetAgentRequestInfo reqInfo) {
		
		 agentDao.delete(new Agent(reqInfo.getAgentId()));
	}

   
	public Iterable<Agent> getAllAgents() {
		
		return agentDao.findAll();
	}
	
	

}
