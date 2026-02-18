package com.abc.JasperReport.service;



import lombok.RequiredArgsConstructor;

import com.abc.JasperReport.entity.Product;
import com.abc.JasperReport.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ProductService {

	private final ProductRepository productRepository;

	public List<Product> getAll() {
		return productRepository.findAll();
	}

	public Optional<Product> getById(Long id) {
		return productRepository.findById(id);
	}

	public Product create(Product product) {
		return productRepository.save(product);
	}

	public Product update(Long id, Product updatedProduct) {
		Product existing = productRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Product not found with ID: " + id));

        existing.setName(updatedProduct.getName());
        existing.setDescription(updatedProduct.getDescription());
        existing.setPrice(updatedProduct.getPrice());
        existing.setStockQuantity(updatedProduct.getStockQuantity());
        existing.setCategory(updatedProduct.getCategory());
        existing.setAvailable(updatedProduct.getAvailable());
        existing.setReleaseDate(updatedProduct.getReleaseDate());
        existing.setImageUrls(updatedProduct.getImageUrls());
        existing.setRating(updatedProduct.getRating());

//		BeanUtils.copyProperties(updatedProduct, existing);
		return productRepository.save(existing);
	}

	public void deleteProduct(Long id) {
		productRepository.deleteById(id);
	}


//	public List<Product> getAllProductfindByName(String name) {
//		return productRepository.getByName(name);
//	}
}