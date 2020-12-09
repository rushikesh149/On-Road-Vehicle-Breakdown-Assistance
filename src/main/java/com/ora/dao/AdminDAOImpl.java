package com.ora.dao;
//implementation class

import java.math.BigInteger;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ora.entity.Mechanic;


public class AdminDAOImpl implements AdminDAO{
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
	public void verifyAndAddMechanic(Mechanic mcn) {
	
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(mcn);
		entityManager.getTransaction().commit();
		entityManager.close();
		System.out.println("Mechanic Added");
	
	}
	
	public List<Mechanic> viewMechanicDetails() {
		EntityManager entityManager= factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Query q = entityManager.createQuery("FROM Mechanic");
		List<Mechanic> list=q.getResultList();
		System.out.println("-------------Displaying Mechanic Details------------");
		System.out.println();
		System.out.println("Mechanic Name"+"\t"+"Mechanic Email Id"+"\t"+"Mechanic Address"+"\t"+"Mechanic Phone Number"+"\t"+"Mechanic Service Type"+"\t"+"Mechanic Location");
		for(Mechanic m : list) {
			System.out.println(m.getMechanicName()+"\t"+m.getMechanicEmailId()+"\t"+m.getMechanicAddress()+"\t\t"+m.getMechanicPhoneNumber()+"\t\t"+
		m.getMechanichServiceType()+"\t\t"+m.getLocation());
		}
		return null;
		
	}
	

}
