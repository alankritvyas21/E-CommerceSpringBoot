package com.alankrit.Ecomm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alankrit.Ecomm.model.footerModel;
import com.alankrit.Ecomm.repository.footerRepository;
import com.alankrit.Ecomm.service.footerService;

@Service
public class footerServiceImpl implements footerService {

	 @Autowired
	 footerRepository footerRepository;
	 
	public footerServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public footerModel createItem(footerModel footer) {
		return footerRepository.save(footer);
	}

	@Override
	public List<footerModel> getAllItems() {
		return footerRepository.findAll();
	}

	@Override
	public List<footerModel> getItemsByType(Integer typeId) {
		return footerRepository.findByTypeId(typeId);
	}

	@Override
	public footerModel updateFooterItem(footerModel footer) {
		return footerRepository.save(footer);
	}

	@Override
	public String deleteItemById(Integer id) {
		footerRepository.deleteById(id);
		return "Footer Item Deleted Successfully.";
	}

}
