package com.alankrit.Ecomm.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class categoryModel {
	
	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id;
	
	private String name;
	
	private String imageUrl1;
	
	private Boolean topCategory;
	
	

	public Integer getId() {
		return Id;
	}



	public void setId(Integer id) {
		Id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getImageUrl1() {
		return imageUrl1;
	}



	public void setImageUrl1(String imageUrl1) {
		this.imageUrl1 = imageUrl1;
	}



	public Boolean getTopCategory() {
		return topCategory;
	}



	public void setTopCategory(Boolean topCategory) {
		this.topCategory = topCategory;
	}



	public categoryModel() {
		// TODO Auto-generated constructor stub
	}

}
