package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.Agent;
import com.example.info.GetAgentRequestInfo;
import com.example.service.AgentService;
import com.example.utilities.ResponseBuilder;
import com.example.utilities.ResponseBuilder.GetResponseInfo;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@ComponentScan("com.example")
public class AgentController {

	@Autowired
	public AgentService agentService;

	@RequestMapping(value = "/", method= RequestMethod.GET)
	public @ResponseBody String getDefaultResp()
	{
		return new ResponseBuilder().getDefault();
				
	}
	
	@RequestMapping(value = "/getAgent", method = RequestMethod.POST)
	public @ResponseBody GetResponseInfo getAgent(@RequestBody GetAgentRequestInfo reqInfo) {
		return new ResponseBuilder()._build(agentService.getAgentDetails(new Integer(reqInfo.getAgentId()).intValue())
				.orElse(new Agent(000, "No Emp", 00)));

	}
	
	@RequestMapping(value = "/addAgent", method = RequestMethod.POST)
	public @ResponseBody String addAgent(@RequestBody GetAgentRequestInfo reqInfo) {
		agentService.addAgent(reqInfo);
		return new ResponseBuilder()._buildAddAgent();

	}

	
	@RequestMapping(value = "/deleteAgent", method = RequestMethod.POST)
	public @ResponseBody String deleteAgent(@RequestBody GetAgentRequestInfo reqInfo) {
		agentService.deleteAgent(reqInfo);
		return new ResponseBuilder()._buildDeleteAgent();

	}

	
	
	@RequestMapping(value = "/getAllAgents", method= RequestMethod.GET)
	public @ResponseBody List<GetResponseInfo> getAllAgents()
	{
		return new ResponseBuilder()._buildAll(agentService.getAllAgents());
				
	}
	
}
