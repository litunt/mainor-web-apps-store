package com.petstore.petstore.dto;

import com.petstore.petstore.enums.Category;
import com.petstore.petstore.enums.PetType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    private Long id;
    private String name;
    private double price;
    private Category category;
    private String description;
    private PetType petType;
    private int quantity;
}
