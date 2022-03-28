package com.petstore.petstore.model;

import com.petstore.petstore.enums.Category;
import com.petstore.petstore.enums.PetType;

public class Product {
    private Long id;
    private String name;
    private Double price;
    private Category category;
    private String description;
    private PetType petType;
}
