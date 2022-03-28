package com.petstore.petstore.service;

import com.petstore.petstore.dto.ProductDTO;
import com.petstore.petstore.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductDTO> getProducts() {
        return productRepository.getProducts();
    }

    public List<ProductDTO> getProductsByCategory(String category) {
        List<ProductDTO> allProducts = productRepository.getProducts();
        List<ProductDTO> result = new ArrayList<>();
        for (ProductDTO p : allProducts) {
            if (p.getCategory().name().equalsIgnoreCase(category)) {
                result.add(p);
            }
        }

        return productRepository.getProducts().stream()
                .filter(p -> p.getCategory().name().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }
}
