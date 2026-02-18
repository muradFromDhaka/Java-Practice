package com.abc.JasperReport.repository;



import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.JasperReport.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	List<Product> findByOrderByNameDesc();


	
	
	
	
	

	

}
