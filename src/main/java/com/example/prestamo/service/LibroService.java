package com.example.prestamo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.prestamo.dao.Todo;
import com.example.prestamo.daoImpl.LibroDaoIMpl;
import com.example.prestamo.entity.Libro;

@Service
public class LibroService implements Todo<Libro>{
	@Autowired
	private LibroDaoIMpl daoIMpl;
	@Override
	public int create(Libro t) {
		// TODO Auto-generated method stub
		return daoIMpl.create(t);
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
		return daoIMpl.readAll();
	}

}
