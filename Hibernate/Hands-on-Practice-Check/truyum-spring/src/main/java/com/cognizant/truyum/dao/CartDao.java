package com.cognizant.truyum.dao;

import java.util.List;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.truyum.model.Cart;
import com.cognizant.truyum.model.MenuItem;
@Repository
public interface CartDao extends CrudRepository<Cart, Long>{

	//@Query("insert into cart  (us_id,menu_id) values(?1,?2)")
	//public void addCartItem(int userId, int menuItemId);
	
	@Query("select f.menu_id from Cart f where f.us_id=?1")
	public List<Integer> getAllCartItems(int userId) throws CartEmptyException;
	
	//@Query("delete from cart f where f.us_id = ?1 and f.mv_id =?2")
	//public void removeCartItem(int userId, int menuItemId);
}
