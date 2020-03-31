package com.moviecruiser.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Favorite {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int fv_id;
	@Column
	@JoinColumn(referencedColumnName = "us_id")
	private int fv_us_id;
	@Column
	@JoinColumn(referencedColumnName = "movie_id")
	private int fv_mv_id;

	public Favorite() {
		super();
	}

	public Favorite(int fv_id, int fv_us_id, int fv_mv_id) {
		super();
		this.fv_id = fv_id;
		this.fv_us_id = fv_us_id;
		this.fv_mv_id = fv_mv_id;
	}

	public int getFv_id() {
		return fv_id;
	}

	public void setFv_id(int fv_id) {
		this.fv_id = fv_id;
	}

	public int getFv_us_id() {
		return fv_us_id;
	}

	public void setFv_us_id(int fv_us_id) {
		this.fv_us_id = fv_us_id;
	}

	public int getFv_mv_id() {
		return fv_mv_id;
	}

	public void setFv_mv_id(int fv_mv_id) {
		this.fv_mv_id = fv_mv_id;
	}

	@Override
	public String toString() {
		return "Favorite [fv_id=" + fv_id + ", fv_us_id=" + fv_us_id + ", fv_mv_id=" + fv_mv_id + "]";
	}

}
