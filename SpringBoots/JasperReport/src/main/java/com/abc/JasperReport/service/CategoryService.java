package com.abc.JasperReport.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.JasperReport.entity.Category;
import com.abc.JasperReport.repository.CategoryRepository;


@Service
public class CategoryService {

//  @Autowired
//  ProductRepository repo;

	private final CategoryRepository categoryRepository;

	@Autowired
	public CategoryService(CategoryRepository CategoryService) {
		this.categoryRepository = CategoryService;
	}

	public List<Category> getAll() {
		return categoryRepository.findAll();
	}

	public Optional<Category> getById(Long id) {
		return categoryRepository.findById(id);
	}

	public Category create(Category category) {
		return categoryRepository.save(category);
	}

	public Category update(Long id, Category updatedCategory) {
		Category existing = categoryRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Product not found with ID: " + id));

//      existing.setName(updatedProduct.getName());
//      existing.setDescription(updatedProduct.getDescription());
//      existing.setPrice(updatedProduct.getPrice());
//      existing.setStockQuantity(updatedProduct.getStockQuantity());
//      existing.setCategory(updatedProduct.getCategory());
//      existing.setAvailable(updatedProduct.getAvailable());
//      existing.setReleaseDate(updatedProduct.getReleaseDate());
//      existing.setImageUrls(updatedProduct.getImageUrls());
//      existing.setRating(updatedProduct.getRating());

		BeanUtils.copyProperties(updatedCategory, existing);
		return categoryRepository.save(existing);
	}

	public void deleteCategory(Long id) {
		categoryRepository.deleteById(id);
	}

}
