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
	
	
	@Column(name="mechanicphonenumber",length=10)
	private BigInteger mechanicPhoneNumber;

	@Column(name="mechanicservicetype")
	private String mechanichServiceType;

	@Column(name="mechanicemailid")
	private String mechanicEmailId;
	
	@Column(name="mechanicpassword")
	private String mechanicPassword;
	
	@Column(name="location")
	private String location;
	
public Mechanic() {
	super();
	
}

	public Mechanic(int mechanicId, String mechanicName, BigInteger mechanicPhoneNumber, String mechanicEmailId,
		String mechanicPassword) {

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