package com.example.demo.dao;

import com.example.demo.model.Product;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepo extends JpaRepository<Product, Integer> {



}