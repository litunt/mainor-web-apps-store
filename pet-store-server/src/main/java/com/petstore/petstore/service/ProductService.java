package com.petstore.petstore.service;

import com.petstore.petstore.dto.ProductDTO;
import com.petstore.petstore.enums.Category;
import com.petstore.petstore.enums.PetType;
import com.petstore.petstore.mapper.ProductMapper;
import com.petstore.petstore.model.Product;
import com.petstore.petstore.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductMapper productMapper;

    public List<ProductDTO> getProductsByCategory(String category) {
        List<Product> allProducts = productRepository.findProductsByCategory(Category.valueOf(category));
        return productMapper.entitiesToDtos(allProducts);
    }

    public List<ProductDTO> getProductsByPetType(String petType) {
        List<Product> allProducts = productRepository.findProductsByPetType(PetType.valueOf(petType));
        return productMapper.entitiesToDtos(allProducts);
    }

    public List<ProductDTO> getProductsByCategoryAndPetType(String category, String petType) {
        List<Product> allProducts = productRepository.findProductsByCategoryAndPetType(
                Category.valueOf(category),
                PetType.valueOf(petType));
        return productMapper.entitiesToDtos(allProducts);
    }

    public void decreaseQuantity(Long productId, int amount) {
        productRepository.updateProductAmount(amount, productId);
    }
}
