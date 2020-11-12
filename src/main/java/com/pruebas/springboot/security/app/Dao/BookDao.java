package com.pruebas.springboot.security.app.Dao;

import java.util.List;
import java.util.Map;

import com.pruebas.springboot.security.app.Model.Book;

public interface BookDao {
	Map<String, Object> getAll();
	List<Book> getList();
	
	List<Map<String, Object>> get();
	

}
