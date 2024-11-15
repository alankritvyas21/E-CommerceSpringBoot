package com.alankrit.Ecomm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alankrit.Ecomm.model.itemModel;
import com.alankrit.Ecomm.repository.itemRepository;
import com.alankrit.Ecomm.service.itemService;

@Service
public class itemServiceImpl implements itemService {

	 @Autowired
	 itemRepository itemRepository;

	@Override
	public itemModel createItem(itemModel item) {
		return itemRepository.save(item);
	}

	@Override
	public List<itemModel> getAllItems() {
		return itemRepository.findAll();
	}

	@Override
	public itemModel getItemByCategory(Integer id) {
		return itemRepository.findById(id).get();
	}

	@Override
	public itemModel updateItem(itemModel item) {
		return itemRepository.save(item);
	}

	@Override
	public String deleteItemById(Integer id) {
		itemRepository.deleteById(id);
		return "Item Deleted Successfully";
	}
}
