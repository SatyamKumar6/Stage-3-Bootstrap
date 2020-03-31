package com.moviecruiser.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.moviecruiser.dao.MovieDaoImpl;
import com.moviecruiser.model.Movie;

@Controller
public class MovieController {

	@Autowired
	MovieDaoImpl movieService;

	@RequestMapping(value = "/Edit-Movie", method = RequestMethod.GET)
	public String showEditMovie(@RequestParam("Id") int movieId, ModelMap model) {
		System.out.println("ControllerMessage M : Edit Movie Page Loding. ");
		Movie movie = movieService.getMovie(movieId);
		model.addAttribute("movie", movie);
		System.out.println("ControllerMessage M : Movie details fetched and Sent to Edit-Movie Page.");
		return "edit-movie";
	}

	@RequestMapping(value = "/Edit-Movie", method = RequestMethod.POST)
	public String editMovie(@RequestParam("movieId") int movieId, @RequestParam("movie-title") String movieTitle,
			@RequestParam("movie-gross") int movieGross, @RequestParam("movie-active") String movieActive,
			@RequestParam("movie-dateOfLaunch") String movieDateOfLaunch,
			@RequestParam("movie-genre") String movieGenre, @RequestParam("movie-teaser") String movieTeaser) {

		System.out.println("ControllerMessage M : Updated Movie details revieved. ");
		Movie movie = new Movie(movieId, movieTitle, movieGross, movieActive, movieDateOfLaunch, movieGenre,
				movieTeaser);
		movieService.UpdateMovie(movie);
		System.out.println("ControllerMessage M : Movie Successfully Updated. ");
		return "edit-movie-status";
	}

	@RequestMapping(value = "/movies", method = RequestMethod.GET)
	public String ShowMoviePage(ModelMap model) {

		System.out.println("ControllerMessage M : Movie link in Admin Page Pressed.");
		List<Movie> movies = movieService.getAdminMovieList();

		model.addAttribute("movies", movies);
		System.out.println("ControllerMessage M : Sending Request to movie-list-admin page. ");
		return "movie-list-admin";

	}
	

}
