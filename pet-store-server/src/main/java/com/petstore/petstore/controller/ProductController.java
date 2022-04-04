package com.petstore.petstore.controller;

import com.petstore.petstore.dto.ProductDTO;
import com.petstore.petstore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/products")
@CrossOrigin
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<ProductDTO> getProducts(@RequestParam @Nullable String category,
                                        @RequestParam @Nullable String petType) {
       if (category != null && petType != null) {
           return productService.getProductsByCategoryAndPetType(category, petType);

       } else if (category != null) {
           return productService.getProductsByCategory(category);
       } else if (petType != null) {
           return productService.getProductsByPetType(petType);
       }
       return Collections.emptyList();
    }
}
