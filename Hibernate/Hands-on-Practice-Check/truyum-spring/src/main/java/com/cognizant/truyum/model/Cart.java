package com.cognizant.truyum.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name ="cart")
public class Cart {
	
	@Id
	private int us_id;
	
	@Column
	@JoinColumn(referencedColumnName = "id")
	private int menu_id;
	
	public Cart() {
		super();
	}

	public Cart(int us_id, int menu_id) {
		super();
		this.us_id = us_id;
		this.menu_id = menu_id;
	}

	public int getUs_id() {
		return us_id;
	}

	public void setUs_id(int us_id) {
		this.us_id = us_id;
	}

	public int getMenu_id() {
		return menu_id;
	}

	public void setMenu_id(int menu_id) {
		this.menu_id = menu_id;
	}

	@Override
	public String toString() {
		return "Favorites [us_id=" + us_id + ", menu_id=" + menu_id + "]";
	}

}
