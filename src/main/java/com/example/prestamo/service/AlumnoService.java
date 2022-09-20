package com.example.prestamo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.prestamo.dao.Todo;
import com.example.prestamo.daoImpl.AlumnoDaoIMpl;
import com.example.prestamo.entity.Alumno;

@Service
public class AlumnoService implements Todo<Alumno>{
	@Autowired
	private AlumnoDaoIMpl daoIMpl;
	@Override
	public int create(Alumno t) {
		// TODO Auto-generated method stub
		return daoIMpl.create(t);
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
		return daoIMpl.readAll();
	}
}
