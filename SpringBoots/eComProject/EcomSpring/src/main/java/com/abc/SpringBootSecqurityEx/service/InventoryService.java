package com.abc.SpringBootSecqurityEx.service;

import com.abc.SpringBootSecqurityEx.dtos.InventoryDTO;
import com.abc.SpringBootSecqurityEx.entity.Inventory;
import com.abc.SpringBootSecqurityEx.entity.Product;
import com.abc.SpringBootSecqurityEx.repository.InventoryRepository;
import com.abc.SpringBootSecqurityEx.repository.ProductRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class InventoryService {

    private final InventoryRepository inventoryRepository;
    private final ProductRepository productRepository;

    /* ================= CREATE ================= */
    public InventoryDTO create(InventoryDTO dto) {

        Product product = productRepository.findById(dto.getProductId())
                .orElseThrow(() -> new RuntimeException("Product not found"));

        Inventory inventory = new Inventory();
        inventory.setProduct(product);
        inventory.setAvailableQuantity(dto.getAvailableQuantity());
        inventory.setReservedQuantity(dto.getReservedQuantity());

        inventoryRepository.save(inventory);
        return mapToDTO(inventory);
    }

    /* ================= GET ALL ================= */
    public List<InventoryDTO> getAll() {
        return inventoryRepository.findAll()
                .stream()
                .map(this::mapToDTO)
                .toList();
    }

    /* ================= GET BY ID ================= */
    public InventoryDTO getById(Long id) {
        Inventory inventory = inventoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Inventory not found"));
        return mapToDTO(inventory);
    }

    /* ================= UPDATE ================= */
    public InventoryDTO update(Long id, InventoryDTO dto) {

        Inventory inventory = inventoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Inventory not found"));

        inventory.setAvailableQuantity(dto.getAvailableQuantity());
        inventory.setReservedQuantity(dto.getReservedQuantity());

        return mapToDTO(inventory);
    }

    /* ================= DELETE ================= */
    public void delete(Long id) {
        Inventory inventory = inventoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Inventory not found"));
        inventoryRepository.delete(inventory);
    }

    /* ================= MAPPER ================= */
    private InventoryDTO mapToDTO(Inventory inventory) {
        return new InventoryDTO(
                inventory.getId(),
                inventory.getProduct().getId(),
                inventory.getAvailableQuantity(),
                inventory.getReservedQuantity()
        );
    }
}
