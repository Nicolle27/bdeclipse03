package com.example.prestamo.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.prestamo.dao.Todo;
import com.example.prestamo.entity.Prestamo;

@Component
public class PrestamoDaoIMpl implements Todo <Prestamo> {
	@Autowired
    private JdbcTemplate jdbcTemplate;
 
	@Override
	public int create(Prestamo t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Prestamo t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Prestamo read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Prestamo> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select *from prestamo", new BeanPropertyRowMapper<Prestamo>(Prestamo.class));
	}


}
