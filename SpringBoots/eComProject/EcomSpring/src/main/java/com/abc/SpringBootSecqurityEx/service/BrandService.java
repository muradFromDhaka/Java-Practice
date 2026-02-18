package com.abc.SpringBootSecqurityEx.service;

import com.abc.SpringBootSecqurityEx.dtos.BrandDTO;
import com.abc.SpringBootSecqurityEx.entity.Brand;
import com.abc.SpringBootSecqurityEx.repository.BrandRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
@Transactional
public class BrandService {

    private final BrandRepository brandRepository;
    private final FileUploadService fileUploadService;

    public List<BrandDTO> getAll(){
        List<BrandDTO> brandDTOS = new ArrayList<>();
      List<Brand> brands =  brandRepository.findAll();
        for (Brand b : brands){
            brandDTOS.add(new BrandDTO(b.getId(), b.getName(), b.getDescription(), b.getLogoUrl()));
        }
        return brandDTOS;
    }


    public BrandDTO getById(Long id) {
        Brand brand = brandRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Brand not found with id: " + id));

        return new BrandDTO(
                brand.getId(),
                brand.getName(),
                brand.getDescription(),
                brand.getLogoUrl()
        );
    }




    public BrandDTO create(BrandDTO dto, MultipartFile logo) {

        Brand brand = new Brand();
        brand.setName(dto.getName());
        brand.setDescription(dto.getDescription());

        if (logo != null && !logo.isEmpty()) {
            brand.setLogoUrl(fileUploadService.upload(logo));
        }

        brandRepository.save(brand);
        dto.setId(brand.getId());
        dto.setDescription(brand.getDescription());
        dto.setLogoUrl(brand.getLogoUrl());
        return dto;
    }

    public BrandDTO update(Long id, BrandDTO dto, MultipartFile logo) {

        Brand brand = brandRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Brand not found"));

        brand.setName(dto.getName());

        if (logo != null && !logo.isEmpty()) {
            brand.setLogoUrl(fileUploadService.upload(logo));
        }

        return new BrandDTO(brand.getId(), brand.getName(),brand.getDescription(), brand.getLogoUrl());
    }
}
