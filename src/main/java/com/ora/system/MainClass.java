package com.ora.system;

import java.math.BigInteger;
import java.util.Scanner;

import com.ora.entity.Admin;
import com.ora.entity.Mechanic;
import com.ora.service.AdminServiceInterfaceImpl;

public class MainClass {
Mechanic mechanic;
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Name: ");
		String mname=scn.nextLine();
		System.out.println("Enter the Password: ");
		String mpass=scn.nextLine();
		System.out.println("Enter the Email: ");
		String memail=scn.nextLine();
		System.out.println("Enter the Phone Number: ");
		BigInteger phone=scn.nextBigInteger();
		scn.nextLine();
		System.out.println("Enter the Address: ");
		String address=scn.nextLine();
		System.out.println("Enter the Service Type: ");
		String servicetype=scn.nextLine();	
		System.out.println("Enter the Location: ");
		String location=scn.next();
		Mechanic mcn=new Mechanic(mname,mpass,memail,address,phone,servicetype,location);
		AdminServiceInterfaceImpl ads=new AdminServiceInterfaceImpl();
		ads.addMechanic(mcn);
		ads.viewMechanicDetails();
		

	}

}
