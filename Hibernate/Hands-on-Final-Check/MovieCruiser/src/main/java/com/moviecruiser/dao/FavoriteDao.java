package com.moviecruiser.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.moviecruiser.model.Favorite;
import com.moviecruiser.model.Movie;

public interface FavoriteDao extends JpaRepository<Favorite, Integer> {

	@Query("select m from Movie m where m.movie_id in (select fv_mv_id from Favorite f where f.fv_us_id=:us_id)")
	public List<Movie> getFavorite(@Param("us_id")int userId);
	
	@Query("delete from Favorite f where f.fv_mv_id=:mv_id and  f.fv_us_id=:fv_us_id")
	public void deleteFavorite(@Param("fv_us_id")int userId,@Param("mv_id")int movieId);
	
	@Query("insert into Favorite f (userId,movieId)")
	public void addFavorite(@Param("userId")int userId,@Param("movieId")int movieId);
}
