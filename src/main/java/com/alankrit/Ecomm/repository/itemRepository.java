package com.alankrit.Ecomm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alankrit.Ecomm.model.itemModel;

public interface itemRepository extends JpaRepository<itemModel, Integer> {
	 List<itemModel> findByCategoryId(Integer categoryId);
}
