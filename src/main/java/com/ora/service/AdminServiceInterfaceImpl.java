package com.ora.service;


import java.util.List;

import com.ora.dao.AdminDAOInterfaceImpl;
import com.ora.entity.Mechanic;

public class AdminServiceInterfaceImpl {
public void addMechanic(Mechanic mcn)
{
	AdminDAOInterfaceImpl obj=new AdminDAOInterfaceImpl();
	obj.verifyAndAddMechanic(mcn);
}
public void viewMechanicDetails()
{
	AdminDAOInterfaceImpl obj=new AdminDAOInterfaceImpl();
	obj.viewMechanicDetails();
	
}
}