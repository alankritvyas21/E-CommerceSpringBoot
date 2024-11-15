package com.alankrit.Ecomm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alankrit.Ecomm.model.itemModel;

@Service
public interface itemService {
	 	public itemModel createItem(itemModel item);
	    
	    public List<itemModel> getAllItems();
	    
	    public itemModel getItemByCategory(Integer id);
	    
	    public itemModel updateItem(itemModel item);
	    
	    public String deleteItemById(Integer id);

}