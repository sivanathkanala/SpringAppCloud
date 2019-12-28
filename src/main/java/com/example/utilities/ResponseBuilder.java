package com.example.utilities;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import com.example.dao.Agent;

public class ResponseBuilder {

	public ResponseBuilder() {

	}

	public GetResponseInfo _build(Agent agent) {
		return new GetResponseInfo()._setAgentId(agent.getId())._setAgentName(agent.getName())
				._setAgentSalary(agent.getSalary());
	}

	public String _buildAddAgent() {
		return "Successfully Added";
	}

	public String getDefault() {
		
		return "Hello World Sivanath";
	}

	public String _buildDeleteAgent() {
		return "Successfully Deleted";
	}
	
	@SuppressWarnings("unchecked")
	public List<GetResponseInfo> _buildAll(Iterable<Agent> agents) {
		
		List<Agent> agentsList = StreamSupport.stream(agents.spliterator(), false).collect(Collectors.toList());
		return agentsList.stream().map(agentInfo -> new GetResponseInfo( agentInfo.getId(),
				agentInfo.getName(), agentInfo.getSalary())).collect(Collectors.toList());
	}
	
	public class GetResponseInfo {
		public int agentId;
		public String agentName;
		public long agentSalary;

		GetResponseInfo()
		{
			
		}
		
		GetResponseInfo(int agentId,String agentName, long agentSalary )
		{
			this.agentId = agentId;
			this.agentName = agentName;
			this.agentSalary = agentSalary;
		}
		
		public int getAgentId() {
			return agentId;
		}

		public GetResponseInfo _setAgentId(int agentId) {
			this.agentId = agentId;
			return this;
		}

		public String getAgentName() {
			return agentName;
		}

		public GetResponseInfo _setAgentName(String agentName) {
			this.agentName = agentName;
			return this;
		}

		public long getAgentSalary() {
			return agentSalary;
		}

		public GetResponseInfo _setAgentSalary(long agentSalary) {
			this.agentSalary = agentSalary;
			return this;
		}

	}
}
