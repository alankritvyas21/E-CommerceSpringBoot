package com.alankrit.Ecomm.service;

import java.util.List;

import com.alankrit.Ecomm.model.categoryModel;

public interface categoryService {
    public categoryModel createCategory(categoryModel category);
    
    public List<categoryModel> getAllCategories();
    
    public categoryModel getCategoryById(Integer id);
    
    public categoryModel updateCategory(categoryModel category);
    
    public String deleteCategoryById(Integer id);
}
