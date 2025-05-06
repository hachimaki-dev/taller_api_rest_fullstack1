package com.profecarlos.tallerapirest.restapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.profecarlos.tallerapirest.restapi.model.Product;



@RestController
@RequestMapping("/api/v1")
public class ProductController {

    private List<Product> productList = new ArrayList<>();

    @PostMapping("product")
    public Product insertProduct(@RequestBody Product producto) {
        int newId = productList.isEmpty() ? 1 : productList.get(productList.size() - 1).getId() + 1;
        producto.setId(newId);
        productList.add(producto);
        return producto;
    }

    @GetMapping("products")
    public List<Product> getAllProducts(){
        return productList;
    }
    
}
