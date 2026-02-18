package com.abc.SpringBootSecqurityEx.controller;

import com.abc.SpringBootSecqurityEx.dtos.ProductReviewDTO;
import com.abc.SpringBootSecqurityEx.service.ProductReviewService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reviews")
@RequiredArgsConstructor
public class ProductReviewController {

    private final ProductReviewService reviewService;

    /* 1️⃣ CREATE */
    @PostMapping
    public ResponseEntity<ProductReviewDTO> create(
            @Valid @RequestBody ProductReviewDTO dto
    ) {
        return ResponseEntity.ok(reviewService.create(dto));
    }

    /* 2️⃣ GET ALL */
    @GetMapping
    public ResponseEntity<List<ProductReviewDTO>> getAll() {
        return ResponseEntity.ok(reviewService.getAll());
    }

    /* 3️⃣ GET BY ID */
    @GetMapping("/{id}")
    public ResponseEntity<ProductReviewDTO> getById(
            @PathVariable Long id
    ) {
        return ResponseEntity.ok(reviewService.getById(id));
    }

    /* 4️⃣ UPDATE */
    @PutMapping("/{id}")
    public ResponseEntity<ProductReviewDTO> update(
            @PathVariable Long id,
            @Valid @RequestBody ProductReviewDTO dto
    ) {
        return ResponseEntity.ok(reviewService.update(id, dto));
    }

    /* 5️⃣ DELETE */
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(
            @PathVariable Long id
    ) {
        reviewService.delete(id);
        return ResponseEntity.ok("Review deleted successfully");
    }
}
