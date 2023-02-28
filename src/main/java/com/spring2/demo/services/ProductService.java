package com.spring2.demo.services;

import com.spring2.demo.models.Product;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class ProductService {
    public List<Product> getProducts(){
        return List.of(
                new Product(
                        142L,
                        "Pc",
                        5200,
                        LocalDate.of(2023, Month.AUGUST,5),
                        2
                )
        );

    }
}
