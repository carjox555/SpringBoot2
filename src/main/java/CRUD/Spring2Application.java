package CRUD;

import CRUD.product.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@SpringBootApplication
public class Spring2Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring2Application.class, args);
	}

@GetMapping(path = "/hola")
	public List<Product> getNames(){
	return  List.of(
			new Product(
			255L,
			500,
			LocalDate.of(2023, Month.APRIL,5),
			2
	));
}

	}








