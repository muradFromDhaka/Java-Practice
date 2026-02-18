package com.abc.SpringBootSecqurityEx.service;

import com.abc.SpringBootSecqurityEx.dtos.ProductVariantDTO;
import com.abc.SpringBootSecqurityEx.entity.Product;
import com.abc.SpringBootSecqurityEx.entity.ProductVariant;
import com.abc.SpringBootSecqurityEx.repository.ProductRepository;
import com.abc.SpringBootSecqurityEx.repository.ProductVariantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductVariantService {

    private final ProductVariantRepository variantRepository;
    private final ProductRepository productRepository;

    /* 1️⃣ CREATE */
    public ProductVariantDTO create(ProductVariantDTO dto) {

        Product product = productRepository.findById(dto.getProductId())
                .orElseThrow(() -> new RuntimeException("Product not found"));

        ProductVariant variant = new ProductVariant();
        variant.setVariantName(dto.getVariantName());
        variant.setVariantValue(dto.getVariantValue());
        variant.setPriceAdjustment(dto.getPriceAdjustment());
        variant.setStock(dto.getStock());
        variant.setProduct(product);

        return mapToDTO(variantRepository.save(variant));
    }

    /* 2️⃣ GET ALL */
    public List<ProductVariantDTO> getAll() {
        return variantRepository.findAll()
                .stream()
                .map(this::mapToDTO)
                .toList();
    }

    /* 3️⃣ GET BY ID */
    public ProductVariantDTO getById(Long id) {
        ProductVariant variant = variantRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Variant not found"));
        return mapToDTO(variant);
    }

    /* 4️⃣ UPDATE */
    public ProductVariantDTO update(Long id, ProductVariantDTO dto) {

        ProductVariant variant = variantRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Variant not found"));

        variant.setVariantName(dto.getVariantName());
        variant.setVariantValue(dto.getVariantValue());
        variant.setPriceAdjustment(dto.getPriceAdjustment());
        variant.setStock(dto.getStock());

        return mapToDTO(variantRepository.save(variant));
    }

    /* 5️⃣ DELETE */
    public void delete(Long id) {
        if (!variantRepository.existsById(id)) {
            throw new RuntimeException("Variant not found");
        }
        variantRepository.deleteById(id);
    }

    /* 🔁 Entity → DTO */
    private ProductVariantDTO mapToDTO(ProductVariant variant) {
        ProductVariantDTO dto = new ProductVariantDTO();
        dto.setId(variant.getId());
        dto.setVariantName(variant.getVariantName());
        dto.setVariantValue(variant.getVariantValue());
        dto.setPriceAdjustment(variant.getPriceAdjustment());
        dto.setStock(variant.getStock());
        dto.setProductId(variant.getProduct().getId());
        return dto;
    }
}
