package com.pruebas.springboot.security.app.DaoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.pruebas.springboot.security.app.Dao.BookDao;


@Repository
public class BookDaoImp implements BookDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Map<String, Object>> get() {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForList("select * from book");
	}
	
	
	

}
