package com.pruebas.springboot.security.app.Model;

public class Book {
	private int id_book;
	private String title;
	private String year;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int id_book, String title, String year) {
		super();
		this.id_book = id_book;
		this.title = title;
		this.year = year;
	}

	public int getId_book() {
		return id_book;
	}

	public void setId_book(int id_book) {
		this.id_book = id_book;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	} 
	
	
	
	
	

}
