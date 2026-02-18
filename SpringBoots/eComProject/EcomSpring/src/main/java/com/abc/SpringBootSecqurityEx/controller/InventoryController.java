package com.abc.SpringBootSecqurityEx.controller;

import com.abc.SpringBootSecqurityEx.dtos.InventoryDTO;
import com.abc.SpringBootSecqurityEx.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventories")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    /* ================= CREATE ================= */
    @PostMapping
    public ResponseEntity<InventoryDTO> create(@RequestBody InventoryDTO dto) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(inventoryService.create(dto));
    }

    /* ================= GET ALL ================= */
    @GetMapping
    public ResponseEntity<List<InventoryDTO>> getAll() {
        return ResponseEntity.ok(inventoryService.getAll());
    }

    /* ================= GET BY ID ================= */
    @GetMapping("/{id}")
    public ResponseEntity<InventoryDTO> getById(@PathVariable Long id) {
        return ResponseEntity.ok(inventoryService.getById(id));
    }

    /* ================= UPDATE ================= */
    @PutMapping("/{id}")
    public ResponseEntity<InventoryDTO> update(
            @PathVariable Long id,
            @RequestBody InventoryDTO dto) {

        return ResponseEntity.ok(inventoryService.update(id, dto));
    }

    /* ================= DELETE ================= */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        inventoryService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
