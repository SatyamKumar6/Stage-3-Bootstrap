package com.moviecruiser.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.moviecruiser.model.User;
@Repository
public interface UserDao extends JpaRepository<User, Integer>{

	@Query("select u from User u where u.us_name=:userName and u.us_password =:userPass")
	public User getUser(@Param("userName")String userName,@Param("userPass")String userPass);
}
