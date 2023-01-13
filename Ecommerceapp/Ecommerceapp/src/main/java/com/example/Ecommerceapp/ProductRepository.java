package com.example.Ecommerceapp;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import jakarta.transaction.Transactional;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	List<Product> findByProductid(@Param("productid") String productid);
	
	List<Product> findByType(@Param("type") String type);
	
	@Transactional
    void deleteByProductid(@Param("productid") String productid);
}
