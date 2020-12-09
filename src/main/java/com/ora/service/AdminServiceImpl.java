package com.ora.service;


import com.ora.dao.AdminDAOImpl;
import com.ora.entity.Admin;
import com.ora.entity.Mechanic;

public class AdminServiceImpl implements AdminService {
public void addMechanic(Mechanic mcn)
{
	AdminDAOImpl obj=new AdminDAOImpl();
	obj.verifyAndAddMechanic(mcn);
}
public void viewMechanicDetails()
{
	AdminDAOImpl obj=new AdminDAOImpl();
	obj.viewMechanicDetails();
	
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