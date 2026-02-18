package com.abc.JasperReport.controller;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.abc.JasperReport.entity.Product;
import com.abc.JasperReport.service.ProductService;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/products")
@CrossOrigin(origins = "*")
public class ProductController {

	
	private final ProductService productService;

	

	@GetMapping
	public List<Product> getAllProducts() {
		return productService.getAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable Long id) {
		return productService.getById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}
	
	
//	@GetMapping("/name/{name}")
//	public ResponseEntity<List<Product>> getProductByName(@PathVariable String name) {
//		List<Product> products = productService.getAllProductfindByName(name);
//
//		if (products.isEmpty()) {
//			return ResponseEntity.notFound().build(); // Or return empty list with 200 OK
//		}
//
//		return ResponseEntity.ok(products);
//	}

    
	@PostMapping
	public ResponseEntity<Product> create(@RequestBody Product product){
		return ResponseEntity.ok(productService.create(product));
	}
	
	
	@PutMapping
	public ResponseEntity<Product> updateProduct(@RequestBody Product product){
		return ResponseEntity.ok(productService.create(product));
	}
	

}
