package com.cognizant.truyum.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.cognizant.truyum.dao.CartDaoSqlImpl;
import com.cognizant.truyum.dao.CartEmptyException;
import com.cognizant.truyum.dao.MenuItemDaoSqlImpl;
import com.cognizant.truyum.model.MenuItem;

@Controller
public class TruYumController {
	
	@Autowired
	MenuItemDaoSqlImpl menudao;
	
	@Autowired
	CartDaoSqlImpl cartdao;
	
	static List<MenuItem> listofcustomers;
	
	@RequestMapping(value = {"/adminpage","menu-item-list-admin"}, method = RequestMethod.GET)
	public String adminPage(ModelMap model)
	{
		List<MenuItem> listforadmin=menudao.getMenuItemListAdmin();
		model.put("list1", listforadmin);
		return "menu-item-list-admin";
	}

	@RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String editingMovie(@RequestParam int id,ModelMap model)
    {
		model.addAttribute("editItem", new MenuItem());
		model.addAttribute("itemId",id);
		return "edit-menu-item";
    }
	
	
		
	@RequestMapping(value = "/edit-menu-item-success", method = RequestMethod.POST)
    public String successpage(@ModelAttribute("editMovie") MenuItem menu,ModelMap model)
    {
	
		menudao.modifyMenuItem(menu);
		return "edit-menu-item-success";
    }
	
	
	
	@ModelAttribute("categoryList")
	public List<String> sourceListGenerator() {
		List<String> list =new ArrayList<String>();
		list.add("Main Course");
		list.add("Starter");
		list.add("Dessert");
		
		return list;
	}


}
