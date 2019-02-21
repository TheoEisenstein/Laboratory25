package com.TeddyCafe.TeddyCafe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.TeddyCafe.TeddyCafe.dao.InventoryDao;
import com.TeddyCafe.TeddyCafe.dao.PatronsDao;



@Controller
public class TeddyCafeController {
	
	
	@Autowired
	private PatronsDao patronsDao;
	
	@Autowired
	private InventoryDao inventoryDao;
	

	@RequestMapping("/")
	//This is the index page.
	public ModelAndView showCafeHome() {
		List<Inventory> inventoryList = inventoryDao.findAll();
	return new ModelAndView("index", "inventory", inventoryList);
	
	}
	
	@RequestMapping("/patron-registration")
	public ModelAndView showPatronRegistration() {
		return new ModelAndView("patron-registration");
	}
	
	@RequestMapping
	public ModelAndView showPatronRegistrationResult(Patrons patron) {
		return new ModelAndView("patron-registration-result");
	}
	
	@RequestMapping("/patrons")
	public ModelAndView patrons() {
		List<Patrons> patronsList = patronsDao.findAll();
		return new ModelAndView("patrons", "patrons", patronsList);
	}
	
}

