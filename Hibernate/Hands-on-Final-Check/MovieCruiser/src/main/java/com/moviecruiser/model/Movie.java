package com.moviecruiser.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {

	@Id
	private int movie_id;
	@Column
	private String movie_title;
	@Column
	private int movie_box_of_office;
	@Column
	private String movie_active;
	@Column
	private String movie_date_of_launch;
	@Column
	private String movie_genre;
	@Column
	private String movie_teaser;
	
	

	public Movie() {
		super();
	}

	// CONSTRUCTER
	public Movie(int movie_id,String movie_title, int movie_box_of_office, String movie_active, String movie_date_of_launch,String movie_genre, String movie_teaser) {
		super();
		this.movie_id = movie_id;
		this.movie_title = movie_title;
		this.movie_box_of_office = movie_box_of_office;
		this.movie_active = movie_active;
		this.movie_date_of_launch = movie_date_of_launch;
		this.movie_genre = movie_genre;
		this.movie_teaser = movie_teaser;
	}

	// GETTER AND SETTERS
	public int getMovie_id() {
		return movie_id;
	}

	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}

	public String getMovie_title() {
		return movie_title;
	}

	public void setMovie_title(String movie_title) {
		this.movie_title = movie_title;
	}

	public int getMovie_box_of_office() {
		return movie_box_of_office;
	}

	public void setMovie_box_of_office(int movie_box_of_office) {
		this.movie_box_of_office = movie_box_of_office;
	}

	public String getMovie_active() {
		return movie_active;
	}

	public void setMovie_active(String movie_active) {
		this.movie_active = movie_active;
	}

	public String getMovie_date_of_launch() {
		return movie_date_of_launch;
	}

	public void setMovie_date_of_launch(String movie_date_of_launch) {
		this.movie_date_of_launch = movie_date_of_launch;
	}

	public String getMovie_genre() {
		return movie_genre;
	}

	public void setMovie_genre(String movie_genre) {
		this.movie_genre = movie_genre;
	}

	public String getMovie_teaser() {
		return movie_teaser;
	}

	public void setMovie_teaser(String movie_teaser) {
		this.movie_teaser = movie_teaser;
	}
		
	

	@Override
	public String toString() {
		return "Movie [movie_id=" + movie_id + ", movie_title=" + movie_title + ", movie_box_of_office="
				+ movie_box_of_office + ", movie_active=" + movie_active + ", movie_date_of_launch="
				+ movie_date_of_launch + ", movie_genre=" + movie_genre + ", movie_teaser=" + movie_teaser + "]";
	}

}
