package com.mobiletrackersystem.service;

import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.standard.Media;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.mobiletrackersystem.dto.EmployeeDto;
import com.mobiletrackersystem.proxy.ReceiverProxy;

@Path("/reciveroperation")

public class ReciverService {
	Gson gson=new Gson();
	ReceiverProxy reciverproxy=new ReceiverProxy();
	private static final String EMPLOYEE="employee";

	@POST
	@Path("/login")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	
	public Response login(EmployeeDto employeedto){
	Map<String,String>result=new HashMap<>();
	result=reciverproxy.login(employeedto.getUsername(), employeedto.getPassword(),EMPLOYEE);
	
	if(result.containsValue("Success")){
		
		return Response.ok(200).entity(gson.toJson(result)).build();
	}


	return Response.status(500).entity(gson.toJson(result)).build();
		
}
	
	
}
