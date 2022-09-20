package com.example.prestamo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.prestamo.dao.Todo;
import com.example.prestamo.daoImpl.DetalleDaoIMpl;
import com.example.prestamo.entity.Detalle;

@Service
public class DetalleService implements Todo<Detalle>{
	@Autowired
	private DetalleDaoIMpl daoIMpl;
	@Override
	public int create(Detalle t) {
		// TODO Auto-generated method stub
		return daoIMpl.create(t);
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
		return daoIMpl.readAll();
	}

}
