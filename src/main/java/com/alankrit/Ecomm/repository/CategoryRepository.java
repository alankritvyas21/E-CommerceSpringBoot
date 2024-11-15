package com.alankrit.Ecomm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.alankrit.Ecomm.model.categoryModel;

public interface CategoryRepository extends JpaRepository<categoryModel, Integer> {
}
