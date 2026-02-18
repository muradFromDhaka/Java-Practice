package com.abc.SpringBootSecqurityEx.service;

import com.abc.SpringBootSecqurityEx.dtos.ProductReviewDTO;
import com.abc.SpringBootSecqurityEx.entity.Product;
import com.abc.SpringBootSecqurityEx.entity.ProductReview;
import com.abc.SpringBootSecqurityEx.entity.User;
import com.abc.SpringBootSecqurityEx.repository.ProductRepository;
import com.abc.SpringBootSecqurityEx.repository.ProductReviewRepository;
import com.abc.SpringBootSecqurityEx.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductReviewService {

    private final ProductReviewRepository reviewRepository;
    private final ProductRepository productRepository;
    private final UserRepository userRepository;

    /* 1️⃣ CREATE */
    public ProductReviewDTO create(ProductReviewDTO dto) {

        Product product = productRepository.findById(dto.getProductId())
                .orElseThrow(() -> new RuntimeException("Product not found"));

        User user = userRepository.findById(dto.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found"));

        ProductReview review = new ProductReview();
        review.setRating(dto.getRating());
        review.setComment(dto.getComment());
        review.setProduct(product);
        review.setUser(user);
        review.setCreatedAt(LocalDateTime.now());

        return mapToDTO(reviewRepository.save(review));
    }

    /* 2️⃣ GET ALL */
    public List<ProductReviewDTO> getAll() {
        return reviewRepository.findAll()
                .stream()
                .map(this::mapToDTO)
                .toList();
    }

    /* 3️⃣ GET BY ID */
    public ProductReviewDTO getById(Long id) {
        ProductReview review = reviewRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Review not found"));
        return mapToDTO(review);
    }

    /* 4️⃣ UPDATE */
    public ProductReviewDTO update(Long id, ProductReviewDTO dto) {

        ProductReview review = reviewRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Review not found"));

        review.setRating(dto.getRating());
        review.setComment(dto.getComment());

        return mapToDTO(reviewRepository.save(review));
    }

    /* 5️⃣ DELETE */
    public void delete(Long id) {
        if (!reviewRepository.existsById(id)) {
            throw new RuntimeException("Review not found");
        }
        reviewRepository.deleteById(id);
    }

    /* 🔁 Entity → DTO */
    private ProductReviewDTO mapToDTO(ProductReview review) {
        ProductReviewDTO dto = new ProductReviewDTO();
        dto.setId(review.getId());
        dto.setRating(review.getRating());
        dto.setComment(review.getComment());
        dto.setProductId(review.getProduct().getId());
//        dto.setUserId(review.getUser().getId());
        return dto;
    }
}
