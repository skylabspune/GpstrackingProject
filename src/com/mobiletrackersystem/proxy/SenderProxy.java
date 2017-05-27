package com.mobiletrackersystem.proxy;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.*;
import com.mobiletrackersystem.dao.MobileGPRSTrackerDao;
import com.mobiletrackersystem.entity.MapLocation;
import com.mobiletrackersystem.dto.MapLocationDto;

public class SenderProxy {
	//SenderProxy senderproxy=new SenderProxy();
MobileGPRSTrackerDao dao=new MobileGPRSTrackerDao();
Gson gson=new Gson();

public Map<String,String>login(String username,String password,String usertype){
	Map<String,String>resultMap=new HashMap<>();
	
	if(username==null||"".equals(username.trim())){
		resultMap.put("Result","Data insuffecient");
		resultMap.put("Message","Please Eneter valid data");
		return resultMap;
	}
	if(password==null||"".equals(password.trim())){
		resultMap.put("Result","Data Insuffecient");
		resultMap.put("Message","Please Enter valid data");
	}
	
	try{
		Boolean authentication=dao.login(username, password, usertype);
		if(authentication){
			resultMap.put("Result","Successful");
			resultMap.put("Message","Login Succesful..");
			return resultMap;
		}
		else{
			resultMap.put("Result", "unSuccesful");
			resultMap.put("Message", "Authentication Failed..");
		}
		
	}
	catch (SQLException e) {
		resultMap.put("Result","Error");
		resultMap.put("Message","DBConnection error");
		resultMap.put("Exception",e.getMessage());
	}
	
	return resultMap;
	
}
}
