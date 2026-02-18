package com.abc.SpringBootSecqurityEx.controller;

import com.abc.SpringBootSecqurityEx.dtos.BrandDTO;
import com.abc.SpringBootSecqurityEx.service.BrandService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
@RequiredArgsConstructor
public class BrandController {

    private final BrandService brandService;

    @GetMapping
    public ResponseEntity<List<BrandDTO>> getAllBrand(){
        return ResponseEntity.ok(brandService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<BrandDTO> getBrandById(@PathVariable Long id) {
        return ResponseEntity.ok(brandService.getById(id));
    }


    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<BrandDTO> create(
            @RequestPart("brand") BrandDTO dto,
            @RequestPart(value = "logo", required = false)
            MultipartFile logo) {

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(brandService.create(dto, logo));
    }

    @PutMapping(value = "/{id}", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<BrandDTO> update(
            @PathVariable Long id,
            @RequestPart("brand") BrandDTO dto,
            @RequestPart(value = "logo", required = false)
            MultipartFile logo) {

        return ResponseEntity.ok(brandService.update(id, dto, logo));
    }
}
