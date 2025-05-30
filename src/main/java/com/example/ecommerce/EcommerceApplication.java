package com.example.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@SpringBootApplication
public class EcommerceApplication {

	@RequestMapping("/")
	public String home() {
		return "Hello World";
	}
	

	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
	}

}
