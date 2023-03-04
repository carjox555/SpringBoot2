package CRUD.product;

import lombok.Data;

import java.time.LocalDate;
@Data
public class Product {
    private Long id;
    private String name;
    private String price;
    private LocalDate fecha;
    private int antiguedad;

    public Product(long l, int i, LocalDate of, int i1) {
    }
}
