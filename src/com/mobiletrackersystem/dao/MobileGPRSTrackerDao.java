package com.mobiletrackersystem.dao;
import com.mobiletrackersystem.entity.*;
import com.mobiletrackersystem.connection.*;

import java.sql.*;
public class MobileGPRSTrackerDao {
	
	public Boolean login(String username,String password,String usertype) throws SQLException{
		Boolean result=false;
		Connection con=null;
		ResultSet rs=null;
		PreparedStatement ps=null;
		String sql="select * from sender where username ='"+username +"'and password='"+password+"' ";
		
		con=DBConnect.getConnection();
		ps=con.prepareStatement(sql);
		rs=ps.executeQuery();
		
		if(rs!=null&&rs.next()){
			con.close();
		}
		con.close();
		return result;
		
	}
	

}
