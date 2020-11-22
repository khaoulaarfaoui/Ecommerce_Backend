package com.ecommerce.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ecommerce.backend.dao.ProductRepository;
import com.ecommerce.backend.entity.Product;

@SpringBootApplication
public class Application implements CommandLineRunner{
	@Autowired 
	private ProductRepository productrepo; 
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	/*
		productrepo.save(
	new Product(null,"White Zara Tshirt","ZARA","White cotton shirt from ZARA, made in Spain.",15,"XS - M - L - XL", "White"));

		productrepo.save(
	new Product(null,"Sun dress Zara","ZARA","Sun dress Zara from ZARA, made in Spain.",45,"XS - M - L - XL", "Red"));

		productrepo.save(
	new Product(null,"Black and white coat","ZARA","Black and white coat from ZARA, made in Spain.",25,"S - M - L - XL", "White"));
		productrepo.findAll().forEach(p ->
		System.out.println(p.toString())
				);
				*/
	}
	
}
