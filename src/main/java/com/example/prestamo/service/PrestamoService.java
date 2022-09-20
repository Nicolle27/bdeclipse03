package com.example.prestamo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.prestamo.dao.Todo;
import com.example.prestamo.daoImpl.PrestamoDaoIMpl;
import com.example.prestamo.entity.Prestamo;

@Service
public class PrestamoService implements Todo <Prestamo>{
	@Autowired
	private PrestamoDaoIMpl daoIMpl;
	@Override
	public int create(Prestamo t) {
		// TODO Auto-generated method stub
		return daoIMpl.create(t);
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
		return daoIMpl.readAll();
	}

}
