package com.ora.service;
import com.ora.dao.*;
import java.util.List;
import com.ora.entity.Mechanic;
public class MechanicServiceImpl implements MechanicService {
	
	MechanicDAO dao;
	public MechanicServiceImpl()
	{
		dao= new MechanicDAOImpl();
	}
	public List<Mechanic> viewRequest(int mechanicId) {
		// TODO Auto-generated method stub
		return dao.viewRequest(mechanicId);
	}
	public List<Mechanic> viewFeedback(int mechanicId) {
		// TODO Auto-generated method stub
		return dao.viewFeedback(mechanicId);
	}


	public Mechanic register(Mechanic mechanic) {
		
		//return dao.register(mechanic);
		return null;
	
	}

	public boolean login(int id, String pass) {
	
	//	return dao.login(id, pass);
		return false;
	}

	public Mechanic logOut(Mechanic mechanic) {

		//return dao.logOut(mechanic);
		return null;
	}
	public static boolean validateMechanic(int mechanicId1, String mechanicPassword1) {
		// TODO Auto-generated method stub
		return false;
	}
	public void addMechanic(Mechanic mechanic) {
		// TODO Auto-generated method stub
		
	}
	
	

}