package com.sky.octa.controller;

import com.sky.octa.entity.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProduct(){
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Mobile"));
        products.add(new Product(2, "Amazon"));
        products.add(new Product(1, "Flipkart"));
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
}
