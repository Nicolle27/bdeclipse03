package com.example.prestamo.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.prestamo.dao.Todo;
import com.example.prestamo.entity.Alumno;

@Component
public class AlumnoDaoIMpl implements Todo <Alumno>{
	@Autowired
    private JdbcTemplate jdbcTemplate;
 
	@Override
	public int create(Alumno t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Alumno t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Alumno read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Alumno> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select *from alumno", new BeanPropertyRowMapper<Alumno>(Alumno.class));
	}

}
