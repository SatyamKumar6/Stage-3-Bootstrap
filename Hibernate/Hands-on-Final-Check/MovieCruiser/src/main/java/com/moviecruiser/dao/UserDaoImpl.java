package com.moviecruiser.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.moviecruiser.model.User;

@Service
public class UserDaoImpl{
	
	private UserDao userdao;
	
	
	public User getUser(String userName, String userPass) {	
		System.out.println("-> DAO Message U : Fetching User detals request recieved.");
		System.out.println(userName +" "+userPass );
		User user = userdao.getUser(userName, userPass);
		
		System.out.println("hello");
		System.out.println("-> DAO Message U : Fetching User detals processed Successfully.");
		return user;
	}
}
