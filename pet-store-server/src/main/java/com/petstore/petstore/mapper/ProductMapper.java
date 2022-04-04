package com.petstore.petstore.mapper;

import com.petstore.petstore.dto.ProductDTO;
import com.petstore.petstore.model.Product;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductMapper {

    public List<ProductDTO> entitiesToDtos(List<Product> products) {
        return products.stream().map(this::entityToDto).collect(Collectors.toList());
    }

    public ProductDTO entityToDto(Product product) {
        ProductDTO dto = new ProductDTO();
        dto.setId(product.getId());
        dto.setCategory(product.getCategory());
        dto.setDescription(product.getDescription());
        dto.setName(product.getName());
        dto.setQuantity(product.getQuantity());
        dto.setPetType(product.getPetType());
        dto.setPrice(product.getPrice());
        return dto;
    }
}
