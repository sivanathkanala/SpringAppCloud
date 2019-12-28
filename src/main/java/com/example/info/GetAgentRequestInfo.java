package com.example.info;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class GetAgentRequestInfo {

	@JsonProperty("agentId")
	public int agentId;
	
	@JsonProperty("agentName")
	public String agentName;
	
	@JsonProperty("agentSalary")
	public long agentSalary;

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public long getAgentSalary() {
		return agentSalary;
	}

	public void setAgentSalary(long agentSalary) {
		this.agentSalary = agentSalary;
	}

	public int getAgentId() {
		return agentId;
	}

	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}
	
}
