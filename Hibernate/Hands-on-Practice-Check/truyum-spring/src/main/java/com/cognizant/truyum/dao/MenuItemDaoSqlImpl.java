package com.cognizant.truyum.dao;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.truyum.model.MenuItem;
@Service
public class MenuItemDaoSqlImpl  {

	@Autowired
	MenuItemDao menuItemDao;
	
	@Transactional
	public List<MenuItem> getMenuItemListAdmin() {
		List<MenuItem> list = menuItemDao.getMenuItemListAdmin();
		return list;
	}

	@Transactional
	public List<MenuItem> getMenuItemListCustomer() {
		List<MenuItem> list = menuItemDao.getMenuItemListCustomer();
		return list;
	}

	@Transactional
	public void modifyMenuItem(MenuItem menuItem) {
		Optional<MenuItem> res = menuItemDao.findById(menuItem.getId());
		MenuItem menuItem1 = res.get();
		menuItem1.setName(menuItem.getName());
		menuItem1.setPrice(menuItem.getPrice());
		menuItem1.setActive(menuItem.isActive());
		menuItem1.setDateOfLaunch(menuItem.getDateOfLaunch());
		menuItem1.setCategory(menuItem.getCategory());
		menuItem1.setFreeDelivery(menuItem.isFreeDelivery());
		menuItemDao.save(menuItem1);
	}

//	@Transactional
//	public MenuItem getMenuItem(int menuItemId) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
