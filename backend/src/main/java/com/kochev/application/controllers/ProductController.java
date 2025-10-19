package com.kochev.application.controllers;

import com.kochev.application.database.ProductsRepository;
import com.kochev.application.models.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class ProductController {

    private final ProductsRepository productRepository;

    @GetMapping(value = "/products")
    public Iterable<Product> product() {
        return productRepository.findAll();
    }
}