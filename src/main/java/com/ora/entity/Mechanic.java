package com.ora.entity;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Mechanic")
public class Mechanic {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="mechanicid")
	private int mechanicId;
	
	
	@Column(name="mechanicname")
	private String mechanicName;
	
	@Column(name="mechanicaddress")
	private String mechanicAddress;

	
	@Column(name="mechanicphonenumber")
	private BigInteger mechanicPhoneNumber;

	@Column(name="mechanicservicetype")
	private String mechanichServiceType;

	@Column(name="mechanicemailid")
	private String mechanicEmailId;
	
	@Column(name="mechanicpassword")
	private String mechanicPassword;
	
	@Column
	private String location;
	
	
public Mechanic(String mname,String mpass,String memail,String maddr,BigInteger phone,String servicetype,String location){
	this.mechanicName=mname;
	this.mechanicPassword=mpass;
	this.mechanicEmailId=memail;
	this.mechanicAddress=maddr;
	this.mechanicPhoneNumber=phone;
	this.mechanichServiceType=servicetype;
	this.location=location;
		
		
	}

public Mechanic() {
	super();
	
}


	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getMechanicId() {
		return mechanicId;
	}

	public void setMechanicId(int mechanicId) {
		this.mechanicId = mechanicId;
	}

	public String getMechanicName() {
		return mechanicName;
	}

	public void setMechanicName(String mechanicName) {
		this.mechanicName = mechanicName;
	}

	public String getMechanicAddress() {
		return mechanicAddress;
	}

	public void setMechanicAddress(String mechanicAddress) {
		this.mechanicAddress = mechanicAddress;
	}

	public BigInteger getMechanicPhoneNumber() {
		return mechanicPhoneNumber;
	}

	public void setMechanicPhoneNumber(BigInteger mechanicPhoneNumber) {
		this.mechanicPhoneNumber = mechanicPhoneNumber;
	}

	public String getMechanichServiceType() {
		return mechanichServiceType;
	}

	public void setMechanichServiceType(String mechanichServiceType) {
		this.mechanichServiceType = mechanichServiceType;
	}

	public String getMechanicEmailId() {
		return mechanicEmailId;
	}

	public void setMechanicEmailId(String mechanicEmailId) {
		this.mechanicEmailId = mechanicEmailId;
	}

	public String getMechanicPassword() {
		return mechanicPassword;
	}

	public void setMechanicPassword(String mechanicPassword) {
		this.mechanicPassword = mechanicPassword;
	}

	
	
	

}