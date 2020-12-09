package com.ora.dao;

import java.util.List;
import com.ora.entity.Mechanic;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;


//import com.o.util.DBUtil;

public class MechanicDAOImpl implements  MechanicDAO {
	EntityManager manager;
	

	public List<Mechanic> viewRequest(int userId) {
		Query query=manager.createQuery("select cc.serviceId,serviceType,location from service cc where cc.user_Id=:id");
		query.setParameter("id", userId);
		List<Mechanic> list=query.getResultList();
		return list;
	}

	public List<Mechanic> viewFeedback(int mechanicId) {
		TypedQuery<Mechanic> query=manager.createQuery("select cc.feedback from Feedback cc where cc.mechanic_Id=:mechanicId",Mechanic.class);
		query.setParameter("mechanicId", mechanicId);
		List<Mechanic> list=query.getResultList();
		return list;
	}

	
	public Mechanic register(Mechanic mechanic) {
		manager.getTransaction().begin();
		manager.persist(mechanic);
		manager.getTransaction().commit();
		return mechanic;
	}

	
	public boolean login(int id,String pass) {
//		 System.out.println("Enter mechanic ID");
//		 int id=new Scanner(System.in).nextInt();
//		 System.out.println("Enter your Password");
//		 String pass=new Scanner(System.in).nextLine();
		// select password Where mechanich_id==id; take password and check is equalto pass or not
		 TypedQuery<Mechanic> query=manager.createQuery("select cc.password from mechanic_info cc where cc.mechanic_id=:id",Mechanic.class);
			query.setParameter("id",id);
			String password1=query.getSingleResult().toString();
			if(pass.equals(password1))
			{
				return true;
			}
		 return false;
	}

	public Mechanic logOut(Mechanic mechanic) {
		// TODO Auto-generated method stub
		 System.exit(0);
		 return null;
	}

}