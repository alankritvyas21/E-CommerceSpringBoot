package com.alankrit.Ecomm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alankrit.Ecomm.model.footerModel;
import com.alankrit.Ecomm.service.footerService;

@RestController
@RequestMapping("/ecommerce")
public class footerController {

	@Autowired
	footerService footerService;
	
	@CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/footerItems")
	public List<footerModel> getFooterItem() {
		return footerService.getAllItems();
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/footer/item/{typeId}")
    public List<footerModel> getItems(@PathVariable("typeId") Integer typeId) {
        return footerService.getItemsByType(typeId);
    }

	@CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/createFooterItem")
    public footerModel createFooterItem(@RequestBody footerModel footerItem) {
        return footerService.createItem(footerItem);
    }
    
	@CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/updateFooterItem")
    public footerModel updateFooterItem(@RequestBody footerModel footerItem) {
    	return footerService.updateFooterItem(footerItem);
    }
    
	@CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/deleteFooterItem/{id}")
    public String deleteCategoryById(@PathVariable Integer id) {
    	return footerService.deleteItemById(id);
    }
	public footerController() {
		// TODO Auto-generated constructor stub
	}

}
