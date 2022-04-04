package com.petstore.petstore.model;

import com.petstore.petstore.enums.Category;
import com.petstore.petstore.enums.PetType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
public class Product {
    @Id
    @Column
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
}
