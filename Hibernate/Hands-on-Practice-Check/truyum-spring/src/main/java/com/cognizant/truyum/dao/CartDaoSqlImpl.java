package com.cognizant.truyum.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.truyum.model.Cart;
import com.cognizant.truyum.model.MenuItem;
@Service
public class CartDaoSqlImpl {

	@Autowired
	CartDao cartDao; 
	
	MenuItemDao menuItemDao;
	@Transactional
	public void addCartItem(int userId, int menuItemId) {
	
		Cart cart= new Cart(userId,menuItemId);
		cartDao.save(cart);
	}

	@Transactional
	public List<MenuItem> getAllCartItems(int userId) throws CartEmptyException {
		List<Integer> list=cartDao.getAllCartItems(userId);
		List<MenuItem> menuItem=new ArrayList<MenuItem>();
		for (Integer i : list) {
			MenuItem menuItem1=menuItemDao.findById(i).get();
			menuItem.add(menuItem1);
		}
		return menuItem;
	}

	@Transactional
	public void removeCartItem(int userId, int menuItemId) {
		Cart cart = new Cart(userId,menuItemId);
		cartDao.delete(cart);
	}

}
