package com.ora.system;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.regex.Pattern;

import javax.persistence.RollbackException;

import com.ora.entity.Mechanic;
import com.ora.entity.User;
import com.ora.exception.InvalidInputException;
import com.ora.exception.UserNotFoundException;
import com.ora.service.AdminServiceImpl;
import com.ora.service.MechanicServiceImpl;
import com.ora.service.UserServiceImpl;

public class MainClass {
	Mechanic mechanic;

	public static void main(String args[]) throws UserNotFoundException, RollbackException, InvalidInputException {
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
			boolean admin = adminService.validateAdmin(adminId, adminName, password);
			if (admin) {
				System.out.println("login successfull");
			} else {
				System.out.println("Invalid Details");
				System.exit(0);
			}

			// implement admin service

			break;
		case 2:
			System.out.println("Welcome for User");
			System.out.println("-----------------------------------------------------------");
			System.out.println("A register \n B login");
			char option1 = scanS.next().charAt(0);

			switch (option1) {
			case 'A':
				System.out.println("Welcome for User Registration");
				System.out.println("-----------------------------------------------------------");
				System.out.println("Enter user id");
				int userId = scanI.nextInt();
				System.out.println("Enter name");
				String userName = scanS.nextLine();
				System.out.println("Enter phone Number");
				BigInteger userPhoneNumber = scanI.nextBigInteger();
				String phoneNo = String.valueOf(userPhoneNumber);
				System.out.println("Enter Email Id");
				String userEmailId = scanS.nextLine();
				System.out.println("Enter Password");
				String userPassword = scanS.nextLine();
				String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
						+ "A-Z]{2,7}$";

				Pattern pat = Pattern.compile(emailRegex);
				if (userId >= 0 && userName.equals(null) && phoneNo.length() == 10 && pat.matcher(userEmailId).matches()
						&& userPassword.length() >= 8) {

					User user = new User(userId, userName, userPhoneNumber, userEmailId, userPassword);
					userService.addUser(user);
					User addedUser = null;
					try {
						if (user != null) {
							addedUser = userService.addUser(user);
							System.out.println(addedUser);
						} else {
							throw new UserNotFoundException("user not found");
						}
					} catch (UserNotFoundException e) {
						e.getMessage();
					}
					System.out.println("Validation successfull \n User registered successfully");

				} else {
					System.out.println("Invalid Details");
					System.exit(0);
				}

			case 'B':
				System.out.println("Welcome for User Login");
				System.out.println("Enter user id");
				int userId1 = scanI.nextInt();
				System.out.println("Enter Password");
				String userPassword1 = scanS.nextLine();
				if (userService.validateUser(userId1, userPassword1)) {
					System.out.println("Login Successfull");

				} else {
					System.out.println(" Invalid UserId and Password");
					System.exit(0);
				}
				break;
			default:
				System.out.println("Enter Correct choice");

			}

			System.out.println("What Type of Service You are looking for:");

			/// Implement User service

			break;
		case 3:
			System.out.println("Welcome for User");
			System.out.println("-----------------------------------------------------------");
			System.out.println("A register \n B login");
			char option2 = scanS.next().charAt(0);
			switch (option2) {
			case 'A':
				System.out.println("Enter Id");
				int mechanicId = scanI.nextInt();
				System.out.println("Enter name");
				String mechanicName = scanS.nextLine();
				System.out.println("Enter Password");
				String mechanicPassword = scanS.nextLine();
				System.out.println("Enter Email Id");
				String mechanicEmailId = scanS.nextLine();
				System.out.println("Enter phone Number");
				BigInteger mechanicPhoneNumber = scanI.nextBigInteger();
				System.out.println("Enter your Service");
				String serviceType = scanS.nextLine();
				System.out.println("Enter location");
				String location = scanS.nextLine();
				System.out.println();
				String mechanicPhoneNo = String.valueOf(mechanicPhoneNumber);
				String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
						+ "A-Z]{2,7}$";

				Pattern pat = Pattern.compile(emailRegex);
				if (mechanicId >= 0 && mechanicName.equals(null) && mechanicPhoneNo.length() == 10
						&& pat.matcher(mechanicEmailId).matches() && mechanicPassword.length() >= 8) {

					Mechanic mechanic = new Mechanic(mechanicId, mechanicName, mechanicPhoneNumber, mechanicEmailId,
							mechanicPassword);
					mechanicService.addMechanic(mechanic);
					System.out.println("Validation successfull \n User registered successfully");

				} else {
					System.out.println("Invalid Details");
					System.exit(0);
				}

			case 'B':
				System.out.println("Welcome for Mechanic Login");
				System.out.println("Enter Mechanic id");
				int mechanicId1 = scanI.nextInt();
				System.out.println("Enter Password");
				String mechanicPassword1 = scanS.nextLine();
				if (mechanicService.validateMechanic(mechanicId1, mechanicPassword1)) {
					System.out.println("Login Successfull");

				} else {
					System.out.println("Invalid mechanicId and Password");
					System.exit(0);
				}
				break;
			default:
				System.out.println("Enter Correct choice");

			}

			// Implement mechanics service

			break;
		default:
			System.out.println("Enter Correct choice");
		}

	}

}
