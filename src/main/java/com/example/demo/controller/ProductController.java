package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	@RequestMapping("/")
	public String home() { 
		
		return "home.jsp";
	}
	@RequestMapping("addProduct")
	public String addProduct(){
			return "home.jsp";
			
		}
		
	}


