package com.spring2.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;


import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product {
    @Id
    private Long id;
    private String name;
    private float price;
    private LocalDate fecha;
    private int antiguedad;
}
