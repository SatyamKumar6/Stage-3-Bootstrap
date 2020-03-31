package com.moviecruiser.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.moviecruiser.model.Movie;

@Repository
public interface MovieDao extends JpaRepository<Movie, Integer>{
	
	@Query("select m from Movie m where m.movie_active =:"+"'active'")
	public List<Movie> getCustomerMovieList();
	
	@Query("select m from Movie m")
	public List<Movie> getAdminMovieList();

	public void UpdateMovie(Movie movie);
	
	@Query("select m from Movie m where m.movie_id =: movieId")
	public Movie getMovie(@Param("movieId")int movieId);

}
