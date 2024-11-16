package com.alankrit.Ecomm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alankrit.Ecomm.model.footerModel;

@Service
public interface footerService {

	public footerModel createItem(footerModel footer);
    
    public List<footerModel> getAllItems();
    
    List<footerModel> getItemsByType(Integer typeId);
    
    public footerModel updateFooterItem(footerModel footer);
    
    public String deleteItemById(Integer id);

}
