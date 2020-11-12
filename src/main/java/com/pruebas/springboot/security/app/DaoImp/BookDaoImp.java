package com.pruebas.springboot.security.app.DaoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.pruebas.springboot.security.app.Dao.BookDao;
import com.pruebas.springboot.security.app.Model.Book;


@Repository
public class BookDaoImp implements BookDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public Map<String, Object> getAll() {
		// TODO Auto-generated method stub
//		List<Book> books = jdbcTemplate.queryForList("select * from ");		
		Map<String, Object> books = jdbcTemplate.queryForMap("SELECT * FROM BOOK");
		
		
//		List<Book> books = jdbcTemplate.queryForList("SELECT * FROM BOOKS")		
		
//		jdbcTemplate.("SELECT * FROM BOOK");
		
		return books;
	}

	@Override
	public List<Book> getList() {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForList("select * from book", Book.class);
	}

	@Override
	public List<Map<String, Object>> get() {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForList("select * from book");
	}
	
	
	

}
