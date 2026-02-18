package com.abc.SpringBootSecqurityEx.controller;

import com.abc.SpringBootSecqurityEx.dtos.ProductVariantDTO;
import com.abc.SpringBootSecqurityEx.service.ProductVariantService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product-variants")
@RequiredArgsConstructor
public class ProductVariantController {

    private final ProductVariantService variantService;

    /* 1️⃣ CREATE */
    @PostMapping
    public ResponseEntity<ProductVariantDTO> create(
            @Valid @RequestBody ProductVariantDTO dto
    ) {
        return ResponseEntity.ok(variantService.create(dto));
    }

    /* 2️⃣ GET ALL */
    @GetMapping
    public ResponseEntity<List<ProductVariantDTO>> getAll() {
        return ResponseEntity.ok(variantService.getAll());
    }

    /* 3️⃣ GET BY ID */
    @GetMapping("/{id}")
    public ResponseEntity<ProductVariantDTO> getById(
            @PathVariable Long id
    ) {
        return ResponseEntity.ok(variantService.getById(id));
    }

    /* 4️⃣ UPDATE */
    @PutMapping("/{id}")
    public ResponseEntity<ProductVariantDTO> update(
            @PathVariable Long id,
            @Valid @RequestBody ProductVariantDTO dto
    ) {
        return ResponseEntity.ok(variantService.update(id, dto));
    }

    /* 5️⃣ DELETE */
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(
            @PathVariable Long id
    ) {
        variantService.delete(id);
        return ResponseEntity.ok("Product variant deleted successfully");
    }
}
