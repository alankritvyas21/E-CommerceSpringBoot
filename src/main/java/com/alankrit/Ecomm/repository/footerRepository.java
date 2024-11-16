package com.alankrit.Ecomm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alankrit.Ecomm.model.footerModel;

public interface footerRepository extends JpaRepository<footerModel, Integer>{
	List<footerModel> findByTypeId(Integer typeId);
}
