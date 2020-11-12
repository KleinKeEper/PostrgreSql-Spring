package com.pruebas.springboot.security.app.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebas.springboot.security.app.Dao.BookDao;
import com.pruebas.springboot.security.app.Model.Book;

@Service
public class BookServiceImp implements BookService {

	@Autowired
	private BookDao bookDao;
	
	@Override
	public Map<String, Object> getAll() {
		// TODO Auto-generated method stub
		return bookDao.getAll();
	}

	@Override
	public List<Book> getList() {
		// TODO Auto-generated method stub
		return bookDao.getList();
	}

	@Override
	public List<Map<String, Object>> get() {
		// TODO Auto-generated method stub
		return bookDao.get();
	}

}
