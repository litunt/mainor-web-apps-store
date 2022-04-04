package com.petstore.petstore.repository;

import com.petstore.petstore.dto.ProductDTO;
import com.petstore.petstore.enums.Category;
import com.petstore.petstore.enums.PetType;
import com.petstore.petstore.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

//    private List<ProductDTO> products = Arrays.asList(
//      new ProductDTO(1L, "Kitty Food", 10.50, Category.FOOD, "the tastiest cat food", PetType.CAT, 134),
//      new ProductDTO(2L, "Adult cat food", 8.98, Category.FOOD, "nutritious food for adult cats", PetType.CAT, 246),
//      new ProductDTO(3L, "Mouse with a bow", 3.50, Category.TOYS, "cute mouse toy", PetType.CAT, 432),
//      new ProductDTO(4L, "Stick with ball", 1.99, Category.TOYS, "stick with fur ball", PetType.CAT, 1076),
//      new ProductDTO(5L, "Crispy fish", 5.99, Category.SNACKS, "crispy fish biscuit", PetType.CAT, 43)
//    );
}
