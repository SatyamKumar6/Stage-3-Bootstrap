package com.cognizant.truyum.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.truyum.model.Cart;
import com.cognizant.truyum.model.MenuItem;

public class CartDaoCollectionImpl{
	private static HashMap<Long, Cart> userCarts;

	private CartDao card;
	public CartDaoCollectionImpl() {
		super();
		if (userCarts == null) {
			userCarts = new HashMap<Long, Cart>();
		}
	}

//	
//	public void addCartItem(long userId, long menuItemId) {
//		
//	}
//
//	
//	public List<MenuItem> getAllCartItems(long userId) throws CartEmptyException {
//		if (userCarts.containsKey(userId)) {
//			List<MenuItem> menuItemList = userCarts.get(userId).getMenuItemList();
//			if (menuItemList.isEmpty()) {
//				throw (new CartEmptyException());
//			} else {
//				double total = 0.0;
//				for (int i = 0; i < menuItemList.size(); i++) {
//					total += menuItemList.get(i).getPrice();
//				}
//				userCarts.get(userId).setTotal(total);
//			}
//			return menuItemList;
//		} else {
//			throw (new CartEmptyException());
//		}
//
//	}
//
//	
//	public void removeCartItem(long userId, long menuItemId) {
//		List<MenuItem> menuItemList = userCarts.get(userId).getMenuItemList();
//		for (int i = 0; i < menuItemList.size(); i++) {
//			if (menuItemList.get(i).getId() == menuItemId) {
//				menuItemList.remove(i);
//				break;
//			}
//		}
//	}

}
