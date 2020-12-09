package com.ora.service;

import java.util.List;

import com.ora.entity.Mechanic;
import com.ora.entity.User;

public interface UserService {
	

		public void addUser(User user);
		public void updateUser(User user);
		public List<Mechanic> searchMechanic();
		public String addRequest();
		public String giveFeedback();
		

}

