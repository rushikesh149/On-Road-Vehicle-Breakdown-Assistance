package com.ora.service;


import java.util.List;

import com.ora.entity.Mechanic;

public interface MechanicService {
	public List<Mechanic> viewRequest(int mechanicId);
	public List<Mechanic> viewFeedback(int mechanicId);
//	public Mechanic register(Mechanic mechanic);
//	public boolean login(int id,String pass);
//	public Mechanic logOut(Mechanic mechanic);

}