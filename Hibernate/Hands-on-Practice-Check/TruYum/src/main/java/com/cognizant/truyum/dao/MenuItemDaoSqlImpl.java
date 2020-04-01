package com.cognizant.truyum.dao;

import java.awt.Menu;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.repository.MenuItemDao;

@Service
public class MenuItemDaoSqlImpl{
	
	@Autowired
	MenuItemDao menuItemDao;

	@Transactional
	public List<MenuItem> getMenuItemListAdmin() {
		List<MenuItem> menu=menuItemDao.getMenuItemListAdmin();
		return menu;
	}

	

	@Transactional
	public void modifyMenuItem(MenuItem menuItem) {
		Optional<MenuItem> res=menuItemDao.findById(menuItem.getId());
		MenuItem menu=res.get();
		menu.setActive(menuItem.isActive());
		menu.setCategory(menuItem.getCategory());
		menu.setDateOfLaunch(menuItem.getDateOfLaunch());
		menu.setFreeDelivery(menuItem.isFreeDelivery());
		menu.setName(menuItem.getName());
		menu.setPrice(menuItem.getPrice());
		
		menuItemDao.save(menu);

	}

	@Transactional
	public MenuItem getMenuItem(long menuItemId) {
		// TODO Auto-generated method stub
		return null;
	}

}
