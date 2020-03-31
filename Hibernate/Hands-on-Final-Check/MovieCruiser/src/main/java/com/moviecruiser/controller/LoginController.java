package com.moviecruiser.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.moviecruiser.dao.MovieDaoImpl;
import com.moviecruiser.dao.UserDaoImpl;
import com.moviecruiser.model.Movie;
import com.moviecruiser.model.User;



@Controller
@SessionAttributes("userid")
public class LoginController {

	@Autowired
	UserDaoImpl userService;

	@Autowired
	MovieDaoImpl movieService;

	public LoginController(UserDaoImpl userService) {
		super();
		this.userService = userService;
	}

	@RequestMapping("/")
	public String showLogin() {
		System.out.println("ControllerMessage L : Login page Loaded.");
		return "index";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam("userName") String username, @RequestParam("userPass") String password,
			ModelMap model) {
		String viewName = "";
		String msg = "";
		System.out.println("Username " +username + "Password " +password);
		User user = userService.getUser(username, password);
		
		System.out.println("user found "+user.getUs_category());
		
		if (user.getUs_category().equals("Admin")) {
			System.out.println("ControllerMessage L : Fetching Admin Movies--");
			List<Movie> movies = movieService.getAdminMovieList();
			System.out.println("ControllerMessage L : Admin Movies Fetched and Sending to movie-list-admin page --");
			viewName = "movie-list-admin";
			model.addAttribute("movies", movies);
			
		} else if (user.getUs_category().equals("Customer")) {
			model.addAttribute("userid", user.getUs_id());
			System.out.println("ControllerMessage L : Fetching Customer Movies--");
			List<Movie> fmovies = movieService.getCustomerMovieList();
			System.out.println("ControllerMessage L : Customer Movies Fetched and Sending to movie-list-customer page --");
			model.addAttribute("fmovies", fmovies);
			viewName = "movie-list-customer";
		} else {
			msg = msg + "Invalid Credentials";
			viewName = "index";
		}
		model.addAttribute("msg", msg);
		return viewName;

	}

	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public String login(HttpServletRequest request, ModelMap model) {
		System.out.println("ControllerMessage L : LogOut Request recieved. --");
		String msg = "You have been Successfully logout.";
		model.addAttribute("msg", msg);
		request.removeAttribute("userid");
		System.out.println("ControllerMessage L : LogOut Request processed. --");
		return "index";

	}

}
