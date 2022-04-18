package com.petstore.petstore.repository;

import com.petstore.petstore.enums.Category;
import com.petstore.petstore.enums.PetType;
import com.petstore.petstore.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT p FROM Product p WHERE p.category = :category")
    List<Product> findProductsByCategory(@Param("category") Category category);

    @Query("SELECT p FROM Product p WHERE p.petType = :petType")
    List<Product> findProductsByPetType(@Param("petType") PetType petType);

    @Query("SELECT p FROM Product p WHERE p.category = :category AND p.petType = :petType")
    List<Product> findProductsByCategoryAndPetType(@Param("category") Category category,
                                                   @Param("petType") PetType petType);

    @Modifying
    @Query("UPDATE Product p SET p.quantity = p.quantity - :quantity WHERE p.id = :productId")
    void updateProductAmount(@Param("quantity") int quantity,
                             @Param("productId") Long productId);

}
