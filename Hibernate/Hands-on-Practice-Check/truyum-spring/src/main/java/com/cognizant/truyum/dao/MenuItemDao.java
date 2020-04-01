package com.cognizant.truyum.dao;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.truyum.model.MenuItem;
@Repository
public interface MenuItemDao extends CrudRepository<MenuItem, String>{
	@Query("select u from MenuItem u")
	public List<MenuItem> getMenuItemListAdmin();
	
	@Query("select u from MenuItem u where active=true")
	public List<MenuItem> getMenuItemListCustomer();

	@Query("select u from MenuItem u where id=?1")
	public Optional<MenuItem> findById(int id);
	
	@Query("update MenuItem m set m.name=?1 ,m.price=?2 , m.active=?3, dateoflaunch=?4, category=?5, freedelivery=?6 where id=?7")
	public void modifyMenuItem(MenuItem menuItem);

	//public MenuItem getMenuItem(int menuItemId);
}
