package com.petstore.petstore;

import com.petstore.petstore.enums.Category;
import com.petstore.petstore.enums.PetType;
import com.petstore.petstore.model.Product;
import com.petstore.petstore.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class PetstoreApplicationInit implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) {
        List<Product> products = Arrays.asList(
                new Product("Kitty Food", 10.50, Category.FOOD, "the tastiest cat food", PetType.CAT, 134),
                new Product("Adult cat food", 8.98, Category.FOOD, "nutritious food for adult cats", PetType.CAT, 246),
                new Product("Mouse with a bow", 3.50, Category.TOYS, "cute mouse toy", PetType.CAT, 432),
                new Product("Stick with ball", 1.99, Category.TOYS, "stick with fur ball", PetType.CAT, 1076),
                new Product("Crispy fish", 5.99, Category.SNACKS, "crispy fish biscuit", PetType.CAT, 43),
                new Product("Doggo Food", 8.99, Category.FOOD, "the tastiest dog food", PetType.DOG, 58),
                new Product("Red ball", 1.28, Category.TOYS, "funny colorful ball for dogs", PetType.DOG, 1036)
        );

        productRepository.saveAll(products);
    }
}
