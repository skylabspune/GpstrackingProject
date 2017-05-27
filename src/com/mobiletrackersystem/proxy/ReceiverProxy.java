package com.mobiletrackersystem.proxy;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.mobiletrackersystem.entity.MapLocation;
import com.mobiletrackersystem.dao.*;

public class ReceiverProxy {
	MobileGPRSTrackerDao dao=new MobileGPRSTrackerDao();
	Gson gson=new Gson();
	
	public Map<String,String>login(String username,String password,String usertype){
		Map<String,String>resultMap=new HashMap();
		if(username==null||"".equals(username.trim())){
			resultMap.put("Result","Data Insuffecient");
			resultMap.put("Message","Please Enter Valid Data");
			return resultMap;
		}
		
		if(password==null||"".equals(password.trim())){
			resultMap.put("Result","Data Insuffecient");
			resultMap.put("Message","Please enter valid Password");
			return resultMap;
		}
		
		try{
			Boolean authentication=dao.login(username, password,usertype);
			if(authentication){
				resultMap.put("Result","Successful");
				resultMap.put("Message", "Login Successful");
			}
			else{
				
				resultMap.put("Result","Error");
				resultMap.put("Message", "Authentication failed");
			}
		
		
		}
		catch (SQLException e) {
			resultMap.put("Result","Error");
			resultMap.put("Message","DB Connection error");
			resultMap.put("Exception",e.getMessage());
		}
		
		
		return resultMap;
	}

}
