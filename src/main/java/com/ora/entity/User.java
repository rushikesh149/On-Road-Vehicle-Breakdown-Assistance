package com.ora.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column (name="userid")
	private int UserId;
	
	@Column (name="username")
	private String userName;
	
	
	
	@Column (name="userphonenumber")
	private int userPhoneNumber;
	
	
	
	@Column (name="useremailid")
	private String userEmailId;
	
	@Column (name="userpassword")
	private int userPassword;

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	
	public int getUserPhoneNumber() {
		return userPhoneNumber;
	}

	public void setUserPhoneNumber(int userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}

	

	public String getUserEmailId() {
		return userEmailId;
	}

	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}

	public int getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(int userPassword) {
		this.userPassword = userPassword;
	}
	
	
	
}
