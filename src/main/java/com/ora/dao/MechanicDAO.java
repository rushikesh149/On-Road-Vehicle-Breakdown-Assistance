package com.ora.dao;

import java.util.List;

import com.ora.entity.Mechanic;

public interface MechanicDAO {
	public List viewMechanicDetails(Mechanic m);
	public List<Mechanic> viewRequest(int mechanicId);
	public List<Mechanic> viewFeedback(int mechanicId);
	public Mechanic register(Mechanic mechanic);
	public boolean login(int id,String pass);
}
