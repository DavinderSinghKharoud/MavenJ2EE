package com.kharoud.web.dao;

import java.sql.*;

import com.kharoud.web.model.Alien;

public class AlienDao {

	
	public Alien getAlien(int aid) {
		
		Alien a = new Alien();
//		a.setAid(2);
//		a.setAname("kharoud");
//		a.setTech("java");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/kharoud","root","9464468230q");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from alien where aid="+aid);
			
			if(rs.next()) {
			     a.setAid(rs.getInt("aid"));
			     a.setAname(rs.getString("aname"));
			     a.setTech( rs.getString("tech"));
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return a;
		
		
	}
}
