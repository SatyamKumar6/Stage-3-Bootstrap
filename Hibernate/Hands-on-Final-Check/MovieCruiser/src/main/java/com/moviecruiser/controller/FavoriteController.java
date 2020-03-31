package com.moviecruiser.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.moviecruiser.dao.FavoriteDaoImpl;
import com.moviecruiser.dao.MovieDaoImpl;
import com.moviecruiser.model.Movie;

@Controller
public class FavoriteController {

	@Autowired
	MovieDaoImpl movieService;

	@Autowired
	FavoriteDaoImpl favoriteService;

	@RequestMapping(value = "/fmovies", method = RequestMethod.GET)
	public String loginnn(ModelMap model) {
		System.out.println("ControllerMessage F :  Movie link in customer Page Pressed. ");
		List<Movie> fmovies = movieService.getCustomerMovieList();
		model.addAttribute("fmovies", fmovies);
		System.out.println("ControllerMessage F : Sending to movie-list-cutomer page. ");
		return "movie-list-customer";
	}

	@RequestMapping(value = "/Add-To-Favorite", method = RequestMethod.GET)
	public String addToFavorite(@RequestParam("userId") int userId, @RequestParam("movieId") int movieId, ModelMap model) {

		System.out.println("ControllerMessage F : Movie added to Favorite Request recieved. ");
		favoriteService.addFavorite(userId, movieId);
		List<Movie> fmovies = movieService.getCustomerMovieList();
		model.addAttribute("fmovies", fmovies);
		System.out.println("ControllerMessage F : Movie added to Favorite Request processed Successfully. ");
		System.out.println("ControllerMessage F : Redirecting to notification page. ");
		return "movie-list-customer-notification";
	}

	@RequestMapping(value = "/Favorites", method = RequestMethod.GET)
	public String favoriteMovies(@RequestParam("userId") int userId, ModelMap model) {

		System.out.println("ControllerMessage F : Loading User favvorites. ");
		List<Movie> fmovies = favoriteService.getFavorite(userId);
		model.addAttribute("fmovies", fmovies);
		if (fmovies.isEmpty()) {
			System.out.println("ControllerMessage F : User Favorites Loaded Suucessfully. ");
			System.out.println("ControllerMessage F : User Favorites is Empty. --");
			System.out.println("ControllerMessage F : Redirecting to Favorites Empty Page. ");
			return "favorites-empty";
		}
		System.out.println("ControllerMessage F : User Favorites Loaded Suucessfully. ");
		System.out.println("ControllerMessage F : Redirecting to Favorites Page. ");
		return "favorites";
	}

	@RequestMapping(value = "/Delete", method = RequestMethod.GET)
	public String Delete(@RequestParam("userId") int userId, @RequestParam("movieId") int movieId, ModelMap model) {

		System.out.println("ControllerMessage F : Delete Movie from Favorite Request recieved. ");
		favoriteService.deleteFavorite(userId, movieId);
		System.out.println("ControllerMessage F : Movie Deleted from Favorite Request processed Successfully. ");
		System.out.println("ControllerMessage F : Redirecting to notification page. --");

		List<Movie> fmovies = favoriteService.getFavorite(userId);
		model.addAttribute("fmovies", fmovies);
		if (fmovies.isEmpty()) {
			System.out.println("ControllerMessage F : User Favorites Loaded Suucessfully.");
			System.out.println("ControllerMessage F : User Favorites is Empty. --");
			System.out.println("ControllerMessage F : Redirecting to Favorites Empty Page. ");
			return "favorites-empty";
		}
		System.out.println("ControllerMessage F : User Favorites Loaded Suucessfully. ");
		System.out.println("ControllerMessage F : Redirecting to Favorites Page. ");
		return "favorites-notification";
	}
	
	
}
