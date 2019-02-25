package com.TeddyCafe.TeddyCafe;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
		
		List<Inventory>listOfItems = inventoryDao.findAll();
		ModelAndView mav = new ModelAndView("index", "items", listOfItems);
		return mav;
		
		
		
		//These are commented out because they were used for the JDBC
		//List<Inventory> inventoryList = inventoryDao.findAll();
		//return new ModelAndView("index", "inventory", inventoryList);
	
	}
//	@RequestMapping("/Inventory")
//	public ModelAndView listInventory(@RequestParam(value="name", required=false) String name,
//			@RequestParam(value="description", required=false) String description,
//			@RequestParam(value="quantity", required=false) String quantity,
//			@RequestParam(value="price", required=false) String price) {
//		ModelAndView mav = new ModelAndView("list-food");
//		mav.addObject("Inventory", inventoryDao.findAll());
//		return mav;
//	}
	
	@RequestMapping("/inventory")
	public ModelAndView showInventory() {
		
		
		List<Inventory> listOfItems = inventoryDao.findAll();
		 ModelAndView mav = new ModelAndView("inventory", "items", listOfItems);
		return mav;
		
	
	}
	
	
	@RequestMapping("/patrons-registration")
	public ModelAndView showPatronRegistration() {
		return new ModelAndView("patron-registration");
	}
	
	@PostMapping("/patrons-registration")
	public ModelAndView create(Patrons patrons) {		
		
		patronsDao.create(patrons);
		
		return new ModelAndView("redirect:/patrons");

}
	
//	//Might need to change this from Test.
//	@RequestMapping("/test")
//	public ModelAndView showPatronRegistrationResult(Patrons patron) {
//		return new ModelAndView("patron-registration-result");
//	}

	
	@RequestMapping("/patrons")
	public ModelAndView patrons() {
		List<Patrons> patronsList = patronsDao.findAll();
		return new ModelAndView("patrons", "patrons", patronsList);
	}
	@RequestMapping("/administration")
	public ModelAndView administration() {
		return new ModelAndView("administration");
	}
	@RequestMapping("/administration0")
	public ModelAndView administration0() {
	
		List<Patrons> patronsList = patronsDao.findAll();
		ModelAndView mav = new ModelAndView("administration0", "patrons", patronsList);
		return mav;
	}
	@RequestMapping("/patron-edit")
	public ModelAndView showEditForm(@RequestParam("id") Long id) {
		ModelAndView mav = new ModelAndView("patron-edit");
		mav.addObject("patron", patronsDao.findById(id));
		return mav;
	}
	
	@PostMapping("/patron-edit")
	public ModelAndView subEditForm(Patrons patron) {
		patronsDao.update(patron);
		return new ModelAndView("redirect:/administration0");
	}
	
	@RequestMapping("/inventory-create")
	public ModelAndView showCreateInventory() {
		return new ModelAndView("inventory-create");
	}
	@PostMapping("/inventory-create")
	public ModelAndView create(Inventory inventory) {		
		
		inventoryDao.create(inventory);
		
		return new ModelAndView("redirect:/administration1");
	}
	
	@PostMapping("/administration0")
	public ModelAndView submitEditPatron(Patrons patrons) {
		patronsDao.update(patrons);
		return new ModelAndView("patron-edit");
	}
	@RequestMapping("/inventory-delete")
	public ModelAndView deleteInventory(@RequestParam("id") Long id) {
		inventoryDao.delete(id);
		return new ModelAndView("redirect:/administration1");
		
	}

	@RequestMapping("/patron-delete")
	public ModelAndView delete(@RequestParam("id") Long id) {
		patronsDao.delete(id);
		return new ModelAndView("redirect:/administration0");
	}
	
	@RequestMapping("/administration1")
	public ModelAndView administration1() {
	List<Inventory> listOfItems = inventoryDao.findAll();
	ModelAndView mav = new ModelAndView("administration1", "items", listOfItems);
	return mav;
	}
}
