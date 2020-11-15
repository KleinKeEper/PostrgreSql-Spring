package com.pruebas.springboot.security.app.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebas.springboot.security.app.service.BookService;

@RestController
@CrossOrigin
@RequestMapping("/")
public class HomeController {

	@Autowired
	private BookService bookService;
	
	@GetMapping("home")
	public String home() {
		return "{status: ok}";
	}
	
	
	@GetMapping("get")
	public List<Map<String, Object>> get(){
		return bookService.get();
	}
	
}
