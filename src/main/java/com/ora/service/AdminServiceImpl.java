package com.ora.service;


import java.util.List;

import com.ora.dao.AdminDAOImpl;
import com.ora.entity.Admin;
import com.ora.entity.Mechanic;

public class AdminServiceImpl implements AdminService {

	AdminDAOImpl obj;
public void addMechanic(Mechanic mcn)
{
	obj.verifyAndAddMechanic(mcn);
}
public List< Mechanic>viewMechanicDetails()
{
	
	return obj.viewMechanicDetails();
	
}
public void addMechanic() {
	// TODO Auto-generated method stub
	
}
public void login(Admin admin) {
	// TODO Auto-generated method stub
	
}
public static boolean validateAdmin(int adminId, String adminName, String password) {
	// TODO Auto-generated method stub
	return false;
}
}