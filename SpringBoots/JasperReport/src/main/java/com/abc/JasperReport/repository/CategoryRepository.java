package com.abc.JasperReport.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.JasperReport.entity.Category;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
