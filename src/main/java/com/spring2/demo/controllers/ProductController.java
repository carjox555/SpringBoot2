package com.spring2.demo.controllers;

import com.spring2.demo.models.Product;
import com.spring2.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/products")
public class ProductController {
 private final ProductService productService;
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
@GetMapping
    public List<Product> getProducts(){
        return this.productService.getProducts();
}

}
