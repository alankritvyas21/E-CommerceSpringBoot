package com.alankrit.Ecomm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alankrit.Ecomm.model.categoryModel;
import com.alankrit.Ecomm.service.categoryService;

@RestController
@RequestMapping("/ecommerce")
public class CategoryController {

    @Autowired
    categoryService categoryService;
    
    @GetMapping("/category")
	public List<categoryModel> getCategories() {
		return categoryService.getAllCategories();
	}
	
	@GetMapping("/category/{id}")
	public categoryModel getCategory(@PathVariable Integer id) {
		return categoryService.getCategoryById(id);
	}

    @PostMapping("/createCategory")
    public categoryModel createCategory(@RequestBody categoryModel category) {
        return categoryService.createCategory(category);
    }
    
    @PutMapping("/updateCategory")
    public categoryModel updateCategory(@RequestBody categoryModel category) {
    	return categoryService.updateCategory(category);
    }
    
    @DeleteMapping("/deleteCategory/{id}")
    public String deleteCategoryById(@PathVariable Integer id) {
    	return categoryService.deleteCategoryById(id);
    }
}
