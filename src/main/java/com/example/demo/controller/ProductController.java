package com.example.demo.controller;

import java.util.List;
import java.util.Optional;
import com.example.demo.dao.ProductRepo;
import com.example.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	@Autowired
	ProductRepo repo;

	@RequestMapping("/")
	public String home() {

		return "home.jsp";
	}

	@PostMapping("/addProduct")
	public Product addProduct(final Product product) {
		repo.save(product);
		return product;

	}

	@GetMapping(path="/products")
	
	public List<Product> getProducts() {
		return repo.findAll();

	}

	@RequestMapping("/product/{serialnumber}")
	
	public Optional<Product> getProduct(@PathVariable("serialnumber") final int serialnumber) {
		 
		
		return repo.findById(serialnumber);

	}

	
	
			
	}
	
			
	

		
	


