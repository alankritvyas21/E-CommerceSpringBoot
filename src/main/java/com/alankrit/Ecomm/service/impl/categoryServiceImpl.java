package com.alankrit.Ecomm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alankrit.Ecomm.model.categoryModel;
import com.alankrit.Ecomm.repository.CategoryRepository;
import com.alankrit.Ecomm.service.categoryService;

@Service
public class categoryServiceImpl implements categoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public categoryModel createCategory(categoryModel category) {
        return categoryRepository.save(category);
    }

	@Override
	public List<categoryModel> getAllCategories() {
		return categoryRepository.findAll();
	}

	@Override
	public categoryModel getCategoryById(Integer id) {
		return categoryRepository.findById(id).get();
	}

	@Override
	public categoryModel updateCategory(categoryModel category) {
		return categoryRepository.save(category);
	}

	@Override
	public String deleteCategoryById(Integer id) {
		categoryRepository.deleteById(id);
		return "Category Deleted Successfully";
	}
}
