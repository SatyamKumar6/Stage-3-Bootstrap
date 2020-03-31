package com.moviecruiser.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.moviecruiser.model.Movie;

@Service
public class MovieDaoImpl {

	MovieDao moviedao;
	
	public List<Movie> getAdminMovieList() {
		List<Movie> movies = moviedao.getAdminMovieList();
		for(Movie movie:movies){
			System.out.println(movie);
		}
		return movies;
	}

	
	public List<Movie> getCustomerMovieList() {
		System.out.println("-> DAO Message M : Fetching customer movie request recieved.");
		List<Movie> fmovies = moviedao.getCustomerMovieList();
		System.out.println("-> DAO Message M : Fetching customer movie processed Successfully");
		return fmovies;
	}

	public void UpdateMovie(Movie movie) {
		System.out.println("-> DAO Message M : Update movie request recieved.");
		moviedao.save(movie);
		System.out.println("-> DAO Message M : Movie Updated Successfully.");
	}

	public Movie getMovie(int movieId) {
		System.out.println("-> DAO Message M : Fetching Movie");
		Movie movie = moviedao.getMovie(movieId);
		System.out.println("-> DAO Message M : Movie Fetched");
		return movie;
	}

}
