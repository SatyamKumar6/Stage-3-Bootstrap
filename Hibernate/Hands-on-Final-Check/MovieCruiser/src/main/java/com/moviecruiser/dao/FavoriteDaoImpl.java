package com.moviecruiser.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.moviecruiser.model.Favorite;
import com.moviecruiser.model.Movie;

@Service
public class FavoriteDaoImpl{

	
	FavoriteDao favDao;
	
	public List<Movie> getFavorite(int userId) {
		System.out.println("-> DAO Message F : Feting movies from favorite request recieved");
		List<Movie> movies = favDao.getFavorite(userId);		
		System.out.println("-> DAO Message F : Movies fetched from favorite successfully");
		return movies;
	}

	
	public void deleteFavorite(int userId, int movieId) {
		System.out.println("-> DAO Message F : Delete from favorite request recieved");
		favDao.deleteFavorite(userId, movieId);
		System.out.println("-> DAO Message F : Movie deleted from favorite successfully");
	}

	
	public void addFavorite(int userId, int movieId) {
		System.out.println("-> DAO Message F : Adding movie to favorite");
		favDao.addFavorite(userId, movieId);
		System.out.println("-> DAO Message F : Movie added to favorite successfully.");

	}

}
