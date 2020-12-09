package com.ora.system;

import java.util.Scanner;

import com.ora.entity.Mechanic;
import com.ora.entity.User;
import com.ora.service.AdminServiceImpl;
import com.ora.service.MechanicServiceImpl;
import com.ora.service.UserServiceImpl;

public class MainClass {
	Mechanic mechanic;

	public static void main(String args[]) {
		// Scanner scn = new Scanner(System.in);
		// System.out.println("Enter the Name: ");
		// String mname = scn.nextLine();
		// System.out.println("Enter the Password: ");
		// String mpass = scn.nextLine();
		// System.out.println("Enter the Email: ");
		// String memail = scn.nextLine();
		// System.out.println("Enter the Phone Number: ");
		// BigInteger phone = scn.nextBigInteger();
		// scn.nextLine();
		// System.out.println("Enter the Address: ");
		// String address = scn.nextLine();
		// System.out.println("Enter the Service Type: ");
		// String servicetype = scn.nextLine();
		// System.out.println("Enter the Location: ");
		// String location = scn.next();
		// Mechanic mcn = new Mechanic(mname, mpass, memail, address, phone,
		// servicetype, location);
		// AdminServiceImpl ads = new AdminServiceImpl();
		// ads.addMechanic(mcn);
		// ads.viewMechanicDetails();

		Scanner scanI = new Scanner(System.in);
		Scanner scanS = new Scanner(System.in);

		AdminServiceImpl adminService = new AdminServiceImpl();
		MechanicServiceImpl mechanicService = new MechanicServiceImpl();
		UserServiceImpl userService = new UserServiceImpl();

		System.out.println("Online Vehicle Brekdown Assistance");
		System.out.println("-----------------------------------------------------------");

		System.out.println("1.Admin\n2.User\n3.Mechanic \n4 Exit ");
		int option = scanI.nextInt();

		switch (option) {
		case 1:
			System.out.println("Welcome for Admin Login");
			System.out.println("-----------------------------------------------------------");
			System.out.println("Enter id");
			int adminId = scanI.nextInt();
			System.out.println("Enter Name");
			String adminName = scanS.nextLine();
			System.out.println("Enter Password");
			String password = scanS.nextLine();
			boolean admin = AdminServiceImpl.validateAdmin(adminId, adminName, password);
			if (admin) {
				System.out.println("login succesfull");
			} else {
				System.out.println("Invalid Details");
				System.exit(0);
			}
			break;
		case 2:
			System.out.println("Welcome for User");
			System.out.println("-----------------------------------------------------------");
			System.out.println("1 register \n2 login");
			int option1 = scanI.nextInt();
			switch (option1) {
			case 1:
				System.out.println("Welcome for User Registration");
				System.out.println("-----------------------------------------------------------");
				System.out.println("Enter user id");
				int userId = scanI.nextInt();
				System.out.println("Enter name");
				String userName = scanS.nextLine();
				System.out.println("Enter phone Number");
				int userPhoneNumber = scanI.nextInt();
				System.out.println("Enter Email Id");
				String userEmailId = scanS.nextLine();
				System.out.println("Enter Password");
				String userPassword = scanS.nextLine();
				if (UserServiceImpl.validateUser(userId, userName, userPhoneNumber, userEmailId, userPassword)) {
					System.out.println("Validation Successfull");
					User user = new User(userId, userName, userPhoneNumber, userEmailId, userPassword);

				} else {
					System.out.println("Invalid Details");
					System.exit(0);
				}
				
			case 2:	System.out.println("Welcome for User Login");
				

			}

		}

	}

}
