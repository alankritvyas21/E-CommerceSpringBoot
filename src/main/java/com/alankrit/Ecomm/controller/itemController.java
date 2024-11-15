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

import com.alankrit.Ecomm.model.categoryModel;
import com.alankrit.Ecomm.model.itemModel;
import com.alankrit.Ecomm.service.categoryService;
import com.alankrit.Ecomm.service.itemService;

@RestController
@RequestMapping("/ecommerce")
public class itemController {
	@Autowired
    itemService itemService;
    
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/item")
	public List<itemModel> getCategories() {
		return itemService.getAllItems();
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/item/{id}")
	public itemModel getCategoryById(@PathVariable Integer id) {
		return itemService.getItemByCategory(id);
	}

	@CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/createItem")
    public itemModel createCategory(@RequestBody itemModel item) {
        return itemService.createItem(item);
    }
    
	@CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/updateItem")
    public itemModel updateCategory(@RequestBody itemModel item) {
    	return itemService.updateItem(item);
    }
    
	@CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/deleteCategory/{id}")
    public String deleteCategoryById(@PathVariable Integer id) {
    	return itemService.deleteItemById(id);
    }
	
	
	public itemController() {
		// TODO Auto-generated constructor stub
	}

}