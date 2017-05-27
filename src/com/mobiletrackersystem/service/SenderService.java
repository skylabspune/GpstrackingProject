package com.mobiletrackersystem.service;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.*;
import com.mobiletrackersystem.dto.CarDto;
import com.mobiletrackersystem.dto.MapLocationDto;
import com.mobiletrackersystem.proxy.SenderProxy;

@Path("/senderoperations")
public class SenderService {
	SenderProxy senderproxy=new SenderProxy();
	Gson gson=new Gson();
	
	private static final String CAR="car";
@POST
@Path("/login")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public Response login(CarDto carDto){
	Map<String,String>result=new HashMap<>();
	result=senderproxy.login(carDto.getUsername(), carDto.getPassword(),CAR);
	if(result.containsValue("Success")){
		return Response.ok(200).entity(gson.toJson(result)).build();		//result type doubtfull
	}
	return Response.status(500).entity(gson.toJson(result)).build();
	
}


}
