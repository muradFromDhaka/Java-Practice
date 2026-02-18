package com.abc.SpringBootSecqurityEx.service;

import com.abc.SpringBootSecqurityEx.dtos.CategoryDTO;
import com.abc.SpringBootSecqurityEx.entity.Category;
import com.abc.SpringBootSecqurityEx.repository.CategoryRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class CategoryService {

    private final CategoryRepository categoryRepository;
    private final FileUploadService fileUploadService;

    /* ================= CREATE ================= */
    public CategoryDTO create(CategoryDTO dto, MultipartFile image) {

        Category category = new Category();
        category.setName(dto.getName());

        if (dto.getParentId() != null) {
            Category parent = categoryRepository.findById(dto.getParentId())
                    .orElseThrow(() -> new RuntimeException("Parent category not found"));
            category.setParent(parent);
        }

        if (image != null && !image.isEmpty()) {
            category.setImageUrl(fileUploadService.upload(image));
        }

        categoryRepository.save(category);
        return mapToDTO(category);
    }

    /* ================= GET ALL ================= */
    public List<CategoryDTO> getAll() {
        return categoryRepository.findAll()
                .stream()
                .map(this::mapToDTO)
                .toList();
    }

    /* ================= GET BY ID ================= */
    public CategoryDTO getById(Long id) {
        Category category = categoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found with id: " + id));
        return mapToDTO(category);
    }

    /* ================= UPDATE ================= */
    public CategoryDTO update(Long id, CategoryDTO dto, MultipartFile image) {

        Category category = categoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found"));

        category.setName(dto.getName());

        if (dto.getParentId() != null) {
            Category parent = categoryRepository.findById(dto.getParentId())
                    .orElseThrow(() -> new RuntimeException("Parent category not found"));
            category.setParent(parent);
        } else {
            category.setParent(null);
        }

        if (image != null && !image.isEmpty()) {
            category.setImageUrl(fileUploadService.upload(image));
        }

        return mapToDTO(category);
    }

    /* ================= DELETE ================= */
    public void delete(Long id) {
        Category category = categoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found"));
        categoryRepository.delete(category);
    }

    /* ================= MAPPER ================= */
    private CategoryDTO mapToDTO(Category category) {
        return new CategoryDTO(
                category.getId(),
                category.getName(),
                category.getImageUrl(),
                category.getParent() != null ? category.getParent().getId() : null
        );
    }
}
