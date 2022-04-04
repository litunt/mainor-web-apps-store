package com.petstore.petstore.model;

import com.petstore.petstore.enums.Category;
import com.petstore.petstore.enums.PetType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    public Product(String name, Double price, Category category, String description, PetType petType, Integer quantity) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
        this.petType = petType;
        this.quantity = quantity;
    }

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private Double price;

    @Column
    @Enumerated(EnumType.STRING)
    private Category category;

    @Column
    private String description;

    @Column
    @Enumerated(EnumType.STRING)
    private PetType petType;

    @Column
    private Integer quantity;
}
