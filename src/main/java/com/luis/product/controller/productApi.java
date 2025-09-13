package com.luis.product.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luis.product.entities.Product;

@RestController
@RequestMapping("/api/v1/product")
public class productApi {
    
// Lista simulando una base de datos en memoria
private List<Product> productList = new ArrayList<>();

// Obtener todos los productos
@GetMapping
public List<Product> getAllProducts() {
    return productList;
}

// Agregar un nuevo producto
@PostMapping
public Product addProduct(Product product) {
    productList.add(product);
    return product;
}

}
