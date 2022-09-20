package com.example.prestamo.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.prestamo.dao.Todo;
import com.example.prestamo.entity.Empleado;

@Component
public class EmpleadoDaoIMpl implements Todo <Empleado>{
	 @Autowired
	    private JdbcTemplate jdbcTemplate;
	 
		@Override
		public int create(Empleado t) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int update(Empleado t) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int delete(int id) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public Empleado read(int id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Empleado> readAll() {
			// TODO Auto-generated method stub
			return jdbcTemplate.query("select *from empleado", new BeanPropertyRowMapper<Empleado>(Empleado.class));
		}


}
