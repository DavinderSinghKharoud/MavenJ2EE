package com.kharoud.web.dao;

import com.kharoud.web.model.Alien;

public class AlienDao {

	public Alien getAlien(int aid) {
		
		Alien a = new Alien();
		a.setAid(2);
		a.setAname("kharoud");
		a.setTech("java");
		
		return a;
		
		
	}
}
