package com.pruebas.springboot.security.app.service;

import java.util.List;
import java.util.Map;

import com.pruebas.springboot.security.app.Model.Book;

public interface BookService {

	List<Map<String, Object>> get();
}
