package com.example.prestamo.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.prestamo.dao.Todo;
import com.example.prestamo.entity.Detalle;

@Component
public class DetalleDaoIMpl implements Todo <Detalle>{
	 @Autowired
	    private JdbcTemplate jdbcTemplate;
	 
		@Override
		public int create(Detalle t) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int update(Detalle t) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int delete(int id) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public Detalle read(int id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Detalle> readAll() {
			// TODO Auto-generated method stub
			return jdbcTemplate.query("select *from detalle", new BeanPropertyRowMapper<Detalle>(Detalle.class));
		}


}
