package com.example.prestamo.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.prestamo.dao.Todo;
import com.example.prestamo.entity.Libro;

@Component
public class LibroDaoIMpl implements Todo <Libro>{
	 @Autowired
	    private JdbcTemplate jdbcTemplate;
	 
		@Override
		public int create(Libro t) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int update(Libro t) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int delete(int id) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public Libro read(int id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Libro> readAll() {
			// TODO Auto-generated method stub
			return jdbcTemplate.query("select *from libro", new BeanPropertyRowMapper<Libro>(Libro.class));
		}


}
